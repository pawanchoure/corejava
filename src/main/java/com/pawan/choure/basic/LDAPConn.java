package com.pawan.choure.basic;
import java.util.Hashtable;

import javax.naming.*;
import javax.naming.directory.*;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

public class LDAPConn {
	public static void main(String []args){
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://172.27.103.26:389");
		env.put("java.naming.ldap.attributes.binary","objectSID");
		env.put("java.naming.ldap.attributes.binary","objectGUID");
		try {
			env.put(Context.SECURITY_PRINCIPAL,"CN=p_admin,CN=Users,DC=aca,DC=com");
			env.put(Context.SECURITY_CREDENTIALS,"cybage@123");
		   // DirContext ctx = new InitialDirContext(env);
		    LdapContext ctx = new InitialLdapContext(env,null);
		    String FILTER = "(&(CN=amolf))";// String FILTER = "(&(CN=p*))";
		   String[] attrIDs = {"CN", "displayName"};
		    SearchControls ctls = new SearchControls();
			ctls.setReturningAttributes(attrIDs);
			ctls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			NamingEnumeration<?> answer = ctx.search("DC=aca,DC=com", FILTER, ctls);
			while(answer.hasMoreElements()){
				SearchResult sr = (SearchResult) answer.next();
				Attributes attrs = sr.getAttributes();
				for (NamingEnumeration<?> values = attrs.getAll(); values.hasMore(); ) {
					System.out.println(values.next());
				}
			}
			ctx.close();
			//byte[] objectGUID=(byte[])attrs.get("objectGUID").get();
			//System.out.println(decodeSID(objectGUID));

		} catch (NamingException e) {
		    e.printStackTrace();
		}
	}
	 public static String decodeSID(byte[] sid) {
	        
	        final StringBuilder strSid = new StringBuilder("S-");

	        // get version
	        final int revision = sid[0];
	        strSid.append(Integer.toString(revision));
	        
	        //next byte is the count of sub-authorities
	        final int countSubAuths = sid[1] & 0xFF;
	        
	        //get the authority
	        long authority = 0;
	        //String rid = "";
	        for(int i = 2; i <= 7; i++) {
	           authority |= ((long)sid[i]) << (8 * (5 - (i - 2)));
	        }
	        strSid.append("-");
	        strSid.append(Long.toHexString(authority));
	        
	        //iterate all the sub-auths
	        int offset = 8;
	        int size = 4; //4 bytes for each sub auth
	        for(int j = 0; j < countSubAuths; j++) {
	            long subAuthority = 0;
	            for(int k = 0; k < size; k++) {
	                subAuthority |= (long)(sid[offset + k] & 0xFF) << (8 * k);
	            }
	            
	            strSid.append("-");
	            strSid.append(subAuthority);
	            
	            offset += size;
	        }
	        
	        return strSid.toString();    
	    }
}
