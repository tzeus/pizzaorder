package com.comandapizza.pizzaorder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Pizza implements Serializable {

	static final long serialVersionUID = 32;
	private String nume;
	private List<Ingredient> ingrediente;
	private int diametru;
	private List<String> sosuri;
	private float pret;
	private List<String> instructiuniSpeciale = new ArrayList<String>(
			Arrays.asList("mai coapta", "mai cruda", "fara sos rosii",
					"fara mozarella", "", ""));
	private List<String> tipBlat;
	private List<Integer> listaDiametru = new ArrayList<Integer>(Arrays.asList(
			28, 32, 40));

	private Ingredient blat = new Ingredient("blat", 10);
	private Ingredient masline = new Ingredient("masline", 3);
	private Ingredient porumb = new Ingredient("porumb", 3);
	private Ingredient ananas = new Ingredient("ananas", 3);
	private Ingredient rucola = new Ingredient("rucola", 3);
	private Ingredient halapenos = new Ingredient("halapenos", 3);
	private Ingredient ciuperci = new Ingredient("ciuperci", 3);
	private Ingredient ardeiGras = new Ingredient("ardei gras", 3);
	private Ingredient pepperoni = new Ingredient("pepperoni", 3);
	private Ingredient ardeIute = new Ingredient("ardei iute", 3);
	private Ingredient rosii = new Ingredient("rosii", 3);
	private Ingredient ceapa = new Ingredient("ceapa", 3);
	private Ingredient usturoi = new Ingredient("usturoi", 3);
	private Ingredient brocoli = new Ingredient("brocoli", 3);
	private Ingredient busuioc = new Ingredient("busuioc", 2);
	private Ingredient oregano = new Ingredient("oregano", 2.5);
	private Ingredient coriandru = new Ingredient("coriandru", 1.7);

	public Ingredient getCoriandru() {
		return coriandru;
	}

	public void setCoriandru(Ingredient coriandru) {
		this.coriandru = coriandru;
	}

	public Ingredient getBlat() {
		return blat;
	}

	public void setBlat(Ingredient blat) {
		this.blat = blat;
	}

	public Ingredient getBusuioc() {
		return busuioc;
	}

	public void setBusuioc(Ingredient busuioc) {
		this.busuioc = busuioc;
	}

	private Ingredient cheddar = new Ingredient("cheddar", 3);
	private Ingredient gorngonzola = new Ingredient("gorgonzola", 3);
	private Ingredient mozarella = new Ingredient("mozarella", 3);
	private Ingredient feta = new Ingredient("feta", 3);
	private Ingredient cascaval = new Ingredient("cascaval", 3);

	private Ingredient ton = new Ingredient("ton", 3);
	private Ingredient fructeDeMare = new Ingredient("fructe de mare", 3);
	private Ingredient sunca = new Ingredient("sunca", 3);
	private Ingredient prosciuto = new Ingredient("prosciuto", 3);
	private Ingredient prosciutoCrudo = new Ingredient("prosciuto crud", 3);
	private Ingredient salam = new Ingredient("salam", 3);
	private Ingredient salamPicant = new Ingredient("salam picant", 3);
	private Ingredient cabanos = new Ingredient("cabanos", 3);
	private Ingredient bacon = new Ingredient("bacon", 3);
	private Ingredient suncaPresata = new Ingredient("sunca presata", 3);
	private Ingredient pieptPui = new Ingredient("piept de pui", 3);
	private Ingredient somon = new Ingredient("somon afumat", 3);

	private List<Ingredient> ingredientQuatroStagioni = new ArrayList<Ingredient>();



	public Pizza(String nume, List<Ingredient> ingrediente, int diametru,
			List<String> sosuri, float pret) {
		super();
		this.nume = nume;
		this.ingrediente = ingrediente;
		this.diametru = diametru;
		this.sosuri = sosuri;
		this.pret = pret;
	}

	public Pizza(String nume, List<Ingredient> ingrediente, int diametru,
			List<String> sosuri, float pret, List<String> instructiuniSpeciale,
			List<String> tipBlat) {
		super();
		this.nume = nume;
		this.ingrediente = ingrediente;
		this.diametru = diametru;
		this.sosuri = sosuri;
		this.pret = pret;
		this.instructiuniSpeciale = instructiuniSpeciale;
		this.tipBlat = tipBlat;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public List<Ingredient> getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(List<Ingredient> ingrediente) {
		this.ingrediente = ingrediente;
	}

	public int getDiametru() {
		return diametru;
	}

	public void setDiametru(int diametru) {
		this.diametru = diametru;
	}

	public List<String> getSosuri() {
		return sosuri;
	}

	public void setSosuri(List<String> sosuri) {
		this.sosuri = sosuri;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	public Ingredient getMasline() {
		return masline;
	}

	public void setMasline(Ingredient masline) {
		this.masline = masline;
	}

	public Ingredient getPorumb() {
		return porumb;
	}

	public void setPorumb(Ingredient porumb) {
		this.porumb = porumb;
	}

	public Ingredient getAnanas() {
		return ananas;
	}

	public void setAnanas(Ingredient ananas) {
		this.ananas = ananas;
	}

	public Ingredient getRucola() {
		return rucola;
	}

	public void setRucola(Ingredient rucola) {
		this.rucola = rucola;
	}

	public Ingredient getHalapenos() {
		return halapenos;
	}

	public void setHalapenos(Ingredient halapenos) {
		this.halapenos = halapenos;
	}

	public Ingredient getCiuperci() {
		return ciuperci;
	}

	public void setCiuperci(Ingredient ciuperci) {
		this.ciuperci = ciuperci;
	}

	public Ingredient getArdeiGras() {
		return ardeiGras;
	}

	public void setArdeiGras(Ingredient ardeiGras) {
		this.ardeiGras = ardeiGras;
	}

	public Ingredient getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Ingredient pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Ingredient getArdeIute() {
		return ardeIute;
	}

	public void setArdeIute(Ingredient ardeIute) {
		this.ardeIute = ardeIute;
	}

	public Ingredient getRosii() {
		return rosii;
	}

	public void setRosii(Ingredient rosii) {
		this.rosii = rosii;
	}

	public Ingredient getCeapa() {
		return ceapa;
	}

	public void setCeapa(Ingredient ceapa) {
		this.ceapa = ceapa;
	}

	public Ingredient getUsturoi() {
		return usturoi;
	}

	public void setUsturoi(Ingredient usturoi) {
		this.usturoi = usturoi;
	}

	public Ingredient getBrocoli() {
		return brocoli;
	}

	public void setBrocoli(Ingredient brocoli) {
		this.brocoli = brocoli;
	}

	public Ingredient getCheddar() {
		return cheddar;
	}

	public void setCheddar(Ingredient cheddar) {
		this.cheddar = cheddar;
	}

	public Ingredient getGorngonzola() {
		return gorngonzola;
	}

	public void setGorngonzola(Ingredient gorngonzola) {
		this.gorngonzola = gorngonzola;
	}

	public Ingredient getMozarella() {
		return mozarella;
	}

	public void setMozarella(Ingredient mozarella) {
		this.mozarella = mozarella;
	}

	public Ingredient getFeta() {
		return feta;
	}

	public void setFeta(Ingredient feta) {
		this.feta = feta;
	}

	public Ingredient getCascaval() {
		return cascaval;
	}

	public void setCascaval(Ingredient cascaval) {
		this.cascaval = cascaval;
	}

	public Ingredient getTon() {
		return ton;
	}

	public void setTon(Ingredient ton) {
		this.ton = ton;
	}

	public Ingredient getFructeDeMare() {
		return fructeDeMare;
	}

	public void setFructeDeMare(Ingredient fructeDeMare) {
		this.fructeDeMare = fructeDeMare;
	}

	public Ingredient getSunca() {
		return sunca;
	}

	public void setSunca(Ingredient sunca) {
		this.sunca = sunca;
	}

	public Ingredient getProsciuto() {
		return prosciuto;
	}

	public void setProsciuto(Ingredient prosciuto) {
		this.prosciuto = prosciuto;
	}

	public Ingredient getProsciutoCrudo() {
		return prosciutoCrudo;
	}

	public void setProsciutoCrudo(Ingredient prosciutoCrudo) {
		this.prosciutoCrudo = prosciutoCrudo;
	}

	public Ingredient getSalam() {
		return salam;
	}

	public void setSalam(Ingredient salam) {
		this.salam = salam;
	}

	public Ingredient getSalamPicant() {
		return salamPicant;
	}

	public void setSalamPicant(Ingredient salamPicant) {
		this.salamPicant = salamPicant;
	}

	public Ingredient getCabanos() {
		return cabanos;
	}

	public void setCabanos(Ingredient cabanos) {
		this.cabanos = cabanos;
	}

	public Ingredient getBacon() {
		return bacon;
	}

	public void setBacon(Ingredient bacon) {
		this.bacon = bacon;
	}

	public Ingredient getSuncaPresata() {
		return suncaPresata;
	}

	public void setSuncaPresata(Ingredient suncaPresata) {
		this.suncaPresata = suncaPresata;
	}

	public Ingredient getPieptPui() {
		return pieptPui;
	}

	public void setPieptPui(Ingredient pieptPui) {
		this.pieptPui = pieptPui;
	}

	public Ingredient getSomon() {
		return somon;
	}

	public void setSomon(Ingredient somon) {
		this.somon = somon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<String> getInstructiuniSpeciale() {
		return instructiuniSpeciale;
	}

	public void setInstructiuniSpeciale(List<String> instructiuniSpeciale) {
		this.instructiuniSpeciale = instructiuniSpeciale;
	}

	public List<String> getTipBlat() {
		return tipBlat;
	}

	public void setTipBlat(List<String> tipBlat) {
		this.tipBlat = tipBlat;
	}

	// QUATRO STAGIONI
	private Pizza quatroStagioniMica = new Pizza("Quatro Stagioni",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci, salam,
					sunca)), listaDiametru.get(0), new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza quatroStagioniMedie = new Pizza("Quatro Stagioni",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci, salam,
					sunca)), listaDiametru.get(1), new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza quatroStagioniMare = new Pizza("Quatro Stagioni",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci, salam,
					sunca)), listaDiametru.get(2), new ArrayList<String>(
					Arrays.asList("ketchup")), 25);

	// MARGHERITA

	private Pizza margheritaMica = new Pizza("Margherita",
			new ArrayList<Ingredient>(Arrays.asList(mozarella, busuioc)), listaDiametru.get(0), new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza margheritaMedie = new Pizza("Margherita",
			new ArrayList<Ingredient>(Arrays.asList(mozarella, busuioc)),
			listaDiametru.get(1), new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza margheritaMare = new Pizza("Margherita",
			new ArrayList<Ingredient>(Arrays.asList(mozarella, busuioc)),
			listaDiametru.get(2), new ArrayList<String>(
					Arrays.asList("ketchup")), 25);

	// QUATRO FORMAGGI

	private Pizza quatroFormaggiMica = new Pizza("Quatro Stagioni",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci, salam,
					sunca)), listaDiametru.get(0), new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza quatroFormaggiMedie = new Pizza("Quatro Stagioni",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci, salam,
					sunca)), listaDiametru.get(1), new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza quatroFormaggiMare = new Pizza("Quatro Stagioni",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci, salam,
					sunca)), listaDiametru.get(2), new ArrayList<String>(
					Arrays.asList("ketchup")), 25);
	// DIAVOLA
		
	private Pizza diavolaMica = new Pizza("Diavola",
 new ArrayList<Ingredient>(
			Arrays.asList(ciuperci, salamPicant, mozarella, ardeIute)),
			listaDiametru.get(0), new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza diavolaMedie = new Pizza("Diavola",
			new ArrayList<Ingredient>(Arrays.asList(ciuperci, salamPicant,
					mozarella, ardeIute)), listaDiametru.get(1),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza diavolaMare = new Pizza("Diavola",
 new ArrayList<Ingredient>(
			Arrays.asList(ciuperci, salamPicant, mozarella, ardeIute)),
			listaDiametru.get(2), new ArrayList<String>(
					Arrays.asList("ketchup")), 25);

	// FOCCACIA

	private Pizza focacciaMica = new Pizza("Focaccia",
			new ArrayList<Ingredient>(Arrays
					.asList(mozarella, masline, busuioc)),
			listaDiametru.get(0), new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza focacciaMedie = new Pizza("Focaccia",
			new ArrayList<Ingredient>(Arrays
					.asList(mozarella, masline, busuioc)),
			listaDiametru.get(1), new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza focacciaMare = new Pizza("Focaccia",
			new ArrayList<Ingredient>(Arrays
					.asList(mozarella, masline, busuioc)),
			listaDiametru.get(2), new ArrayList<String>(
					Arrays.asList("ketchup")), 25);
	// NAPOLI

	private Pizza napoliMica = new Pizza("Napoli",
 new ArrayList<Ingredient>(
			Arrays.asList(cabanos, ciuperci, salam, masline)),
			listaDiametru.get(0), new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza napoliMedie = new Pizza("Napoli",
 new ArrayList<Ingredient>(
			Arrays.asList(cabanos, ciuperci, salam, masline)),
			listaDiametru.get(1), new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza napoliMare = new Pizza("Napoli",
 new ArrayList<Ingredient>(
			Arrays.asList(cabanos, ciuperci, salam, masline)),
			listaDiametru.get(2), new ArrayList<String>(
					Arrays.asList("ketchup")), 25);
	// ROMA

	private Pizza romaMica = new Pizza("Roma",
			new ArrayList<Ingredient>(Arrays.asList(mozarella, bacon, cabanos,
					ceapa, ardeiGras, oregano)), listaDiametru.get(0),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza romaMedie = new Pizza("Roma",
			new ArrayList<Ingredient>(Arrays.asList(mozarella, bacon, cabanos,
					ceapa, ardeiGras, oregano)), listaDiametru.get(1),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza romaMare = new Pizza("Roma",
			new ArrayList<Ingredient>(Arrays.asList(mozarella, bacon, cabanos,
					ceapa, ardeiGras, oregano)), listaDiametru.get(2),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 25);
	// MARINARA

	private Pizza marinaraMica = new Pizza("Marinara",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, fructeDeMare,
					ton, mozarella)), listaDiametru.get(0),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza marinaraMedie = new Pizza("Marinara",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, fructeDeMare,
					ton, mozarella)), listaDiametru.get(1),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza marinaraMare = new Pizza("Marinara",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, fructeDeMare,
					ton, mozarella)), listaDiametru.get(2),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 25);

	// PROSCIUTO FUNGHI

	private Pizza prosciutoFunghiMica = new Pizza("Prosciuto Funghi",
			new ArrayList<Ingredient>(Arrays.asList(prosciutoCrudo, ciuperci,
					mozarella)), listaDiametru.get(0), new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza prosciutoFunghiMedie = new Pizza("Prosciuto Funghi",
			new ArrayList<Ingredient>(Arrays.asList(prosciutoCrudo, ciuperci,
					mozarella)), listaDiametru.get(1), new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza prosciutoFunghiMare = new Pizza("Prosciuto Funghi",
			new ArrayList<Ingredient>(Arrays.asList(prosciutoCrudo, ciuperci,
					mozarella)), listaDiametru.get(2), new ArrayList<String>(
					Arrays.asList("ketchup")), 25);

	// SALAMI

	private Pizza salamiMica = new Pizza("Salami",
 new ArrayList<Ingredient>(
			Arrays.asList(mozarella, ciuperci, salam)), listaDiametru.get(0),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza salamiMedie = new Pizza("Salami",
 new ArrayList<Ingredient>(
			Arrays.asList(mozarella, ciuperci, salam)), listaDiametru.get(1),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza salamiMare = new Pizza("Salami",
 new ArrayList<Ingredient>(
			Arrays.asList(mozarella, ciuperci, salam)), listaDiametru.get(2),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 25);

	// CON CARNE

	private Pizza conCarneMica = new Pizza("Con Carne",
			new ArrayList<Ingredient>(Arrays.asList(cabanos, prosciuto, salam,
					sunca, bacon)), listaDiametru.get(0),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza conCarneMedie = new Pizza("Con Carne",
			new ArrayList<Ingredient>(Arrays.asList(cabanos, prosciuto, salam,
					sunca, bacon)), listaDiametru.get(1),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza conCarneMare = new Pizza("Con Carne",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci, salam,
					sunca)), listaDiametru.get(2), new ArrayList<String>(
					Arrays.asList("ketchup")), 25);

	// VEGETARIANA

	private Pizza vegetarianaMica = new Pizza("Vegetariana",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci,
					masline, ardeiGras, brocoli, rosii)), listaDiametru.get(0),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 15);

	private Pizza vegetarianaMedie = new Pizza("Vegetariana",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci,
					masline, ardeiGras, brocoli, rosii)), listaDiametru.get(1),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 18);

	private Pizza vegetarianaMare = new Pizza("Vegetariana",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci,
					masline, ardeiGras, brocoli, rosii)), listaDiametru.get(2),
			new ArrayList<String>(
					Arrays.asList("ketchup")), 25);

	// esti un gay, esti okay, esti maro la chilotei adevarati.

	public List<Integer> getListaDiametru() {
		return listaDiametru;
	}

	public void setListaDiametru(List<Integer> listaDiametru) {
		this.listaDiametru = listaDiametru;
	}

	public Ingredient getOregano() {
		return oregano;
	}

	public void setOregano(Ingredient oregano) {
		this.oregano = oregano;
	}

	public List<Ingredient> getIngredientQuatroStagioni() {
		return ingredientQuatroStagioni;
	}

	public void setIngredientQuatroStagioni(
			List<Ingredient> ingredientQuatroStagioni) {
		this.ingredientQuatroStagioni = ingredientQuatroStagioni;
	}

	public Pizza getQuatroStagioniMica() {
		return quatroStagioniMica;
	}

	public void setQuatroStagioniMica(Pizza quatroStagioniMica) {
		this.quatroStagioniMica = quatroStagioniMica;
	}

	public Pizza getQuatroStagioniMedie() {
		return quatroStagioniMedie;
	}

	public void setQuatroStagioniMedie(Pizza quatroStagioniMedie) {
		this.quatroStagioniMedie = quatroStagioniMedie;
	}

	public Pizza getQuatroStagioniMare() {
		return quatroStagioniMare;
	}

	public void setQuatroStagioniMare(Pizza quatroStagioniMare) {
		this.quatroStagioniMare = quatroStagioniMare;
	}

	public Pizza getMargheritaMica() {
		return margheritaMica;
	}

	public void setMargheritaMica(Pizza margheritaMica) {
		this.margheritaMica = margheritaMica;
	}

	public Pizza getMargheritaMedie() {
		return margheritaMedie;
	}

	public void setMargheritaMedie(Pizza margheritaMedie) {
		this.margheritaMedie = margheritaMedie;
	}

	public Pizza getMargheritaMare() {
		return margheritaMare;
	}

	public void setMargheritaMare(Pizza margheritaMare) {
		this.margheritaMare = margheritaMare;
	}

	public Pizza getQuatroFormaggiMica() {
		return quatroFormaggiMica;
	}

	public void setQuatroFormaggiMica(Pizza quatroFormaggiMica) {
		this.quatroFormaggiMica = quatroFormaggiMica;
	}

	public Pizza getQuatroFormaggiMedie() {
		return quatroFormaggiMedie;
	}

	public void setQuatroFormaggiMedie(Pizza quatroFormaggiMedie) {
		this.quatroFormaggiMedie = quatroFormaggiMedie;
	}

	public Pizza getQuatroFormaggiMare() {
		return quatroFormaggiMare;
	}

	public void setQuatroFormaggiMare(Pizza quatroFormaggiMare) {
		this.quatroFormaggiMare = quatroFormaggiMare;
	}

	public Pizza getDiavolaMica() {
		return diavolaMica;
	}

	public void setDiavolaMica(Pizza diavolaMica) {
		this.diavolaMica = diavolaMica;
	}

	public Pizza getDiavolaMedie() {
		return diavolaMedie;
	}

	public void setDiavolaMedie(Pizza diavolaMedie) {
		this.diavolaMedie = diavolaMedie;
	}

	public Pizza getDiavolaMare() {
		return diavolaMare;
	}

	public void setDiavolaMare(Pizza diavolaMare) {
		this.diavolaMare = diavolaMare;
	}

	public Pizza getFocacciaMica() {
		return focacciaMica;
	}

	public void setFocacciaMica(Pizza focacciaMica) {
		this.focacciaMica = focacciaMica;
	}

	public Pizza getFocacciaMedie() {
		return focacciaMedie;
	}

	public void setFocacciaMedie(Pizza focacciaMedie) {
		this.focacciaMedie = focacciaMedie;
	}

	public Pizza getFocacciaMare() {
		return focacciaMare;
	}

	public void setFocacciaMare(Pizza focacciaMare) {
		this.focacciaMare = focacciaMare;
	}

	public Pizza getNapoliMica() {
		return napoliMica;
	}

	public void setNapoliMica(Pizza napoliMica) {
		this.napoliMica = napoliMica;
	}

	public Pizza getNapoliMedie() {
		return napoliMedie;
	}

	public void setNapoliMedie(Pizza napoliMedie) {
		this.napoliMedie = napoliMedie;
	}

	public Pizza getNapoliMare() {
		return napoliMare;
	}

	public void setNapoliMare(Pizza napoliMare) {
		this.napoliMare = napoliMare;
	}

	public Pizza getRomaMica() {
		return romaMica;
	}

	public void setRomaMica(Pizza romaMica) {
		this.romaMica = romaMica;
	}

	public Pizza getRomaMedie() {
		return romaMedie;
	}

	public void setRomaMedie(Pizza romaMedie) {
		this.romaMedie = romaMedie;
	}

	public Pizza getRomaMare() {
		return romaMare;
	}

	public void setRomaMare(Pizza romaMare) {
		this.romaMare = romaMare;
	}

	public Pizza getMarinaraMica() {
		return marinaraMica;
	}

	public void setMarinaraMica(Pizza marinaraMica) {
		this.marinaraMica = marinaraMica;
	}

	public Pizza getMarinaraMedie() {
		return marinaraMedie;
	}

	public void setMarinaraMedie(Pizza marinaraMedie) {
		this.marinaraMedie = marinaraMedie;
	}

	public Pizza getMarinaraMare() {
		return marinaraMare;
	}

	public void setMarinaraMare(Pizza marinaraMare) {
		this.marinaraMare = marinaraMare;
	}

	public Pizza getProsciutoFunghiMica() {
		return prosciutoFunghiMica;
	}

	public void setProsciutoFunghiMica(Pizza prosciutoFunghiMica) {
		this.prosciutoFunghiMica = prosciutoFunghiMica;
	}

	public Pizza getProsciutoFunghiMedie() {
		return prosciutoFunghiMedie;
	}

	public void setProsciutoFunghiMedie(Pizza prosciutoFunghiMedie) {
		this.prosciutoFunghiMedie = prosciutoFunghiMedie;
	}

	public Pizza getProsciutoFunghiMare() {
		return prosciutoFunghiMare;
	}

	public void setProsciutoFunghiMare(Pizza prosciutoFunghiMare) {
		this.prosciutoFunghiMare = prosciutoFunghiMare;
	}

	public Pizza getSalamiMica() {
		return salamiMica;
	}

	public void setSalamiMica(Pizza salamiMica) {
		this.salamiMica = salamiMica;
	}

	public Pizza getSalamiMedie() {
		return salamiMedie;
	}

	public void setSalamiMedie(Pizza salamiMedie) {
		this.salamiMedie = salamiMedie;
	}

	public Pizza getSalamiMare() {
		return salamiMare;
	}

	public void setSalamiMare(Pizza salamiMare) {
		this.salamiMare = salamiMare;
	}

	public Pizza getConCarneMica() {
		return conCarneMica;
	}

	public void setConCarneMica(Pizza conCarneMica) {
		this.conCarneMica = conCarneMica;
	}

	public Pizza getConCarneMedie() {
		return conCarneMedie;
	}

	public void setConCarneMedie(Pizza conCarneMedie) {
		this.conCarneMedie = conCarneMedie;
	}

	public Pizza getConCarneMare() {
		return conCarneMare;
	}

	public void setConCarneMare(Pizza conCarneMare) {
		this.conCarneMare = conCarneMare;
	}

	public Pizza getVegetarianaMica() {
		return vegetarianaMica;
	}

	public void setVegetarianaMica(Pizza vegetarianaMica) {
		this.vegetarianaMica = vegetarianaMica;
	}

	public Pizza getVegetarianaMedie() {
		return vegetarianaMedie;
	}

	public void setVegetarianaMedie(Pizza vegetarianaMedie) {
		this.vegetarianaMedie = vegetarianaMedie;
	}

	public Pizza getVegetarianaMare() {
		return vegetarianaMare;
	}

	public void setVegetarianaMare(Pizza vegetarianaMare) {
		this.vegetarianaMare = vegetarianaMare;
	}

	@Override
	public String toString() {
		return "Pizza [nume=" + nume + ", ingrediente=" + ingrediente
				+ ", diametru=" + diametru + ", sosuri=" + sosuri + ", pret="
				+ pret + ", instructiuniSpeciale=" + instructiuniSpeciale
				+ ", tipBlat=" + tipBlat + "]";
	}
}
