package n1exercici1;

public class N1Exercici1 {
	
	// Static block
    static
    {
        // Print statement
        System.out.println(
            "Static block can be printed without main method");
    }

	public static void main(String[] args) {
		
		Instrument instrumento1 = new InstrumentVent("su nombre Vent", 234.58f);
		System.out.println(instrumento1);
		((InstrumentVent) instrumento1).tocar();

		InstrumentVent instrumentVent = new InstrumentVent("su nombre Vent", 234.58f);		
		instrumentVent.tocar();

		///////////////////////
		
		Instrument instrumento2 = new InstrumentCorda("su nombre Corda", 234.58f);
		System.out.println(instrumento2);
		((InstrumentCorda) instrumento2).tocar();
		
		InstrumentCorda instrumentCorda = new InstrumentCorda("su nombre Corda", 234.58f);
		instrumentCorda.tocar();
		
		//////////////////////////
		
		Instrument instrumento3 = new InstrumentPercussio("su nombre Percussio", 234.58f);
		System.out.println(instrumento3);
		((InstrumentPercussio) instrumento3).tocar();
		
		InstrumentPercussio instrumentPercussio = new InstrumentPercussio("su nombre Percussio", 234.58f);
		instrumentPercussio.tocar();

	}

}
