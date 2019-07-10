package com.pawan.choure.enums;

public class EnumExample {
	PrinterType printerType;

	public EnumExample(PrinterType pType) {
		printerType = pType;
	}

	public static void main(String[] args) {
		EnumExample enumTest1 = new EnumExample(PrinterType.LASER);
		enumTest1.feature();
		EnumExample enumTest2 = new EnumExample(PrinterType.INKJET);
		enumTest2.feature();

	}

	public void feature() {
		switch (printerType) {
		case DOTMATRIX:
			System.out.println("Dot-matrix printers are economical");
			break;
		case INKJET:
			System.out.println("Inkjet printers provide decent quality prints");
			break;
		case LASER:
			System.out
					.println("Laser printers provide the best quality prints");
			break;
		}
		System.out.println("Print page capacity per minute: "
				+ printerType.getPrintPageCapacity());
	}

}

enum PrinterType {
	DOTMATRIX(5), INKJET(10), LASER(50);
	private int pagePrintCapacity;

	private PrinterType(int pagePrintCapacity) {
		this.pagePrintCapacity = pagePrintCapacity;
	}

	public int getPrintPageCapacity() {
		return pagePrintCapacity;
	}
}
