package com.kh.day10.mara;

import java.util.List;

public class Mara {
	private String menu; // 마라탕or마라샹궈 선택
	// ----------고기류----------
	private int beef;
	private int ramb;
	private int intestines;
	private int bigIntestines;
	private int rectum;
	private int tripe;
	// ----------해산물----------
	private int shrimp;
	private int squid;
	private int fishBall;
	private int crapMeat;
	private int fishCakes;
	private int dumpling;
	private int sausage;
	private int ham;
	private int frideTofu;
	private int tofu;
	private int dryTofu;
	private int driedBeanCurd;
	// ----------채소류----------
	private int bokChoy;
	private int napaCabbage;
	private int cilantro;
	private int beanSprouts;
	private int soybeanSprout;
	private int potato;
	private int sweetPumpkin;
	private int lotusRoot;
	private int bambooShoot;
	// ----------버섯류----------
	private int enokiMushroom;
	private int woodEarMushroom;
	private int kingOysterMushroom;
	private int whiteWoodEarMushroom;
	private int ShiitakeMushroom;
	private int oysterMushroom;
	// ----------누들류----------
	private int ChineseGlassNoodle;
	private int flatNoodle;
	private int cellophaneNoodle;
	private int cornNoodle;
	private int fenHaoziNoodle;
	private int wheatFlakesNoodles;
	// ----------맵기선택----------
	private int Whitesoop;
	private int littleSpicy;
	private int Spicy;
	private int verySpicy;
	// ----------추가메뉴----------
	private int SweetAndSourPork;
	private int bigSweetAndSourPork;
	private int friedRice;
	private int steamedRice;
	// ----------음료주류----------
	private int coke;
	private int cider;
	private int soju;
	private int beer;
	
	private int gram;
	private int price;
	
	public Mara() {}

	public Mara(String menu, int beef, int ramb, int intestines, int bigIntestines, int rectum,
			int tripe, int shrimp, int squid, int fishBall, int crapMeat, int fishCakes,
			int dumpling, int sausage, int ham, int frideTofu, int tofu, int dryTofu,
			int driedBeanCurd, int bokChoy, int napaCabbage, int cilantro, int beanSprouts,
			int soybeanSprout, int potato, int sweetPumpkin, int lotusRoot, int bambooShoot,
			int enokiMushroom, int woodEarMushroom, int kingOysterMushroom, int whiteWoodEarMushroom,
			int shiitakeMushroom, int oysterMushroom, int chineseGlassNoodle, int flatNoodle,
			int cellophaneNoodle, int cornNoodle, int fenHaoziNoodle, int wheatFlakesNoodles,
			int whitesoop, int littleSpicy, int spicy, int verySpicy, int sweetAndSourPork,
			int bigSweetAndSourPork, int friedRice, int steamedRice, int coke, int cider,
			int soju, int beer, int gram, int price) {
		super();
		this.menu = menu;
		this.beef = beef;
		this.ramb = ramb;
		this.intestines = intestines;
		this.bigIntestines = bigIntestines;
		this.rectum = rectum;
		this.tripe = tripe;
		this.shrimp = shrimp;
		this.squid = squid;
		this.fishBall = fishBall;
		this.crapMeat = crapMeat;
		this.fishCakes = fishCakes;
		this.dumpling = dumpling;
		this.sausage = sausage;
		this.ham = ham;
		this.frideTofu = frideTofu;
		this.tofu = tofu;
		this.dryTofu = dryTofu;
		this.driedBeanCurd = driedBeanCurd;
		this.bokChoy = bokChoy;
		this.napaCabbage = napaCabbage;
		this.cilantro = cilantro;
		this.beanSprouts = beanSprouts;
		this.soybeanSprout = soybeanSprout;
		this.potato = potato;
		this.sweetPumpkin = sweetPumpkin;
		this.lotusRoot = lotusRoot;
		this.bambooShoot = bambooShoot;
		this.enokiMushroom = enokiMushroom;
		this.woodEarMushroom = woodEarMushroom;
		this.kingOysterMushroom = kingOysterMushroom;
		this.whiteWoodEarMushroom = whiteWoodEarMushroom;
		this.ShiitakeMushroom = shiitakeMushroom;
		this.oysterMushroom = oysterMushroom;
		this.ChineseGlassNoodle = chineseGlassNoodle;
		this.flatNoodle = flatNoodle;
		this.cellophaneNoodle = cellophaneNoodle;
		this.cornNoodle = cornNoodle;
		this.fenHaoziNoodle = fenHaoziNoodle;
		this.wheatFlakesNoodles = wheatFlakesNoodles;
		this.Whitesoop = whitesoop;
		this.littleSpicy = littleSpicy;
		this.Spicy = spicy;
		this.verySpicy = verySpicy;
		this.SweetAndSourPork = sweetAndSourPork;
		this.bigSweetAndSourPork = bigSweetAndSourPork;
		this.friedRice = friedRice;
		this.steamedRice = steamedRice;
		this.coke = coke;
		this.cider = cider;
		this.soju = soju;
		this.beer = beer;
		this.gram = gram;
		this.price = price;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getBeef() {
		return beef;
	}

	public void setBeef(int beef) {
		this.beef = beef;
	}

	public int getRamb() {
		return ramb;
	}

	public void setRamb(int ramb) {
		this.ramb = ramb;
	}

	public int getIntestines() {
		return intestines;
	}

	public void setIntestines(int intestines) {
		this.intestines = intestines;
	}

	public int getBigIntestines() {
		return bigIntestines;
	}

	public void setBigIntestines(int bigIntestines) {
		this.bigIntestines = bigIntestines;
	}

	public int getRectum() {
		return rectum;
	}

	public void setRectum(int rectum) {
		this.rectum = rectum;
	}

	public int getTripe() {
		return tripe;
	}

	public void setTripe(int tripe) {
		this.tripe = tripe;
	}

	public int getShrimp() {
		return shrimp;
	}

	public void setShrimp(int shrimp) {
		this.shrimp = shrimp;
	}

	public int getSquid() {
		return squid;
	}

	public void setSquid(int squid) {
		this.squid = squid;
	}

	public int getFishBall() {
		return fishBall;
	}

	public void setFishBall(int fishBall) {
		this.fishBall = fishBall;
	}

	public int getCrapMeat() {
		return crapMeat;
	}

	public void setCrapMeat(int crapMeat) {
		this.crapMeat = crapMeat;
	}

	public int getFishCakes() {
		return fishCakes;
	}

	public void setFishCakes(int fishCakes) {
		this.fishCakes = fishCakes;
	}

	public int getDumpling() {
		return dumpling;
	}

	public void setDumpling(int dumpling) {
		this.dumpling = dumpling;
	}

	public int getSausage() {
		return sausage;
	}

	public void setSausage(int sausage) {
		this.sausage = sausage;
	}

	public int getHam() {
		return ham;
	}

	public void setHam(int ham) {
		this.ham = ham;
	}

	public int getFrideTofu() {
		return frideTofu;
	}

	public void setFrideTofu(int frideTofu) {
		this.frideTofu = frideTofu;
	}

	public int getTofu() {
		return tofu;
	}

	public void setTofu(int tofu) {
		this.tofu = tofu;
	}

	public int getDrytofu() {
		return dryTofu;
	}

	public void setDrytofu(int drytofu) {
		dryTofu = drytofu;
	}

	public int getDriedBeanCurd() {
		return driedBeanCurd;
	}

	public void setDriedBeanCurd(int driedBeanCurd) {
		this.driedBeanCurd = driedBeanCurd;
	}

	public int getBokChoy() {
		return bokChoy;
	}

	public void setBokChoy(int bokChoy) {
		this.bokChoy = bokChoy;
	}

	public int getNapaCabbage() {
		return napaCabbage;
	}

	public void setNapaCabbage(int napaCabbage) {
		this.napaCabbage = napaCabbage;
	}

	public int getCilantro() {
		return cilantro;
	}

	public void setCilantro(int cilantro) {
		this.cilantro = cilantro;
	}

	public int getBeanSprouts() {
		return beanSprouts;
	}

	public void setBeanSprouts(int beanSprouts) {
		this.beanSprouts = beanSprouts;
	}

	public int getSoybeanSprout() {
		return soybeanSprout;
	}

	public void setSoybeanSprout(int soybeanSprout) {
		this.soybeanSprout = soybeanSprout;
	}

	public int getPotato() {
		return potato;
	}

	public void setPotato(int potato) {
		this.potato = potato;
	}

	public int getSweetPumpkin() {
		return sweetPumpkin;
	}

	public void setSweetPumpkin(int sweetPumpkin) {
		this.sweetPumpkin = sweetPumpkin;
	}

	public int getLotusRoot() {
		return lotusRoot;
	}

	public void setLotusRoot(int lotusRoot) {
		this.lotusRoot = lotusRoot;
	}

	public int getBambooShoot() {
		return bambooShoot;
	}

	public void setBambooShoot(int bambooShoot) {
		this.bambooShoot = bambooShoot;
	}

	public int getEnokiMushroom() {
		return enokiMushroom;
	}

	public void setEnokiMushroom(int enokiMushroom) {
		this.enokiMushroom = enokiMushroom;
	}

	public int getWoodEarMushroom() {
		return woodEarMushroom;
	}

	public void setWoodEarMushroom(int woodEarMushroom) {
		this.woodEarMushroom = woodEarMushroom;
	}

	public int getKingOysterMushroom() {
		return kingOysterMushroom;
	}

	public void setKingOysterMushroom(int kingOysterMushroom) {
		this.kingOysterMushroom = kingOysterMushroom;
	}

	public int getWhiteWoodEarMushroom() {
		return whiteWoodEarMushroom;
	}

	public void setWhiteWoodEarMushroom(int whiteWoodEarMushroom) {
		this.whiteWoodEarMushroom = whiteWoodEarMushroom;
	}

	public int getShiitakeMushroom() {
		return ShiitakeMushroom;
	}

	public void setShiitakeMushroom(int shiitakeMushroom) {
		ShiitakeMushroom = shiitakeMushroom;
	}

	public int getOysterMushroom() {
		return oysterMushroom;
	}

	public void setOysterMushroom(int oysterMushroom) {
		this.oysterMushroom = oysterMushroom;
	}

	public int getChineseGlassNoodle() {
		return ChineseGlassNoodle;
	}

	public void setChineseGlassNoodle(int chineseGlassNoodle) {
		ChineseGlassNoodle = chineseGlassNoodle;
	}

	public int getFlatNoodle() {
		return flatNoodle;
	}

	public void setFlatNoodle(int flatNoodle) {
		this.flatNoodle = flatNoodle;
	}

	public int getCellophaneNoodle() {
		return cellophaneNoodle;
	}

	public void setCellophaneNoodle(int cellophaneNoodle) {
		this.cellophaneNoodle = cellophaneNoodle;
	}

	public int getCornNoodle() {
		return cornNoodle;
	}

	public void setCornNoodle(int cornNoodle) {
		this.cornNoodle = cornNoodle;
	}

	public int getFenHaoziNoodle() {
		return fenHaoziNoodle;
	}

	public void setFenHaoziNoodle(int fenHaoziNoodle) {
		this.fenHaoziNoodle = fenHaoziNoodle;
	}

	public int getWheatFlakesNoodles() {
		return wheatFlakesNoodles;
	}

	public void setWheatFlakesNoodles(int wheatFlakesNoodles) {
		this.wheatFlakesNoodles = wheatFlakesNoodles;
	}

	public int getWhitesoop() {
		return Whitesoop;
	}

	public void setWhitesoop(int whitesoop) {
		Whitesoop = whitesoop;
	}

	public int getLittleSpicy() {
		return littleSpicy;
	}

	public void setLittleSpicy(int littleSpicy) {
		this.littleSpicy = littleSpicy;
	}

	public int getSpicy() {
		return Spicy;
	}

	public void setSpicy(int spicy) {
		Spicy = spicy;
	}

	public int getVerySpicy() {
		return verySpicy;
	}

	public void setVerySpicy(int verySpicy) {
		this.verySpicy = verySpicy;
	}

	public int getSweetAndSourPork() {
		return SweetAndSourPork;
	}

	public void setSweetAndSourPork(int sweetAndSourPork) {
		SweetAndSourPork = sweetAndSourPork;
	}

	public int getBigSweetAndSourPork() {
		return bigSweetAndSourPork;
	}

	public void setBigSweetAndSourPork(int bigSweetAndSourPork) {
		this.bigSweetAndSourPork = bigSweetAndSourPork;
	}

	public int getFriedRice() {
		return friedRice;
	}

	public void setFriedRice(int friedRice) {
		this.friedRice = friedRice;
	}

	public int getSteamedRice() {
		return steamedRice;
	}

	public void setSteamedRice(int steamedRice) {
		this.steamedRice = steamedRice;
	}
	
	public int getCoke() {
		return coke;
	}

	public void setcoke(int coke) {
		this.coke = coke;
	}
	
	public int getCider() {
		return cider;
	}

	public void setCider(int cider) {
		this.cider = cider;
	}
	
	public int getSoju() {
		return soju;
	}

	public void setSoju(int soju) {
		this.soju = soju;
	}
	
	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}
	
	public int getGram() {
		return gram;
	}

	public void setGram(int gram) {
		this.gram = gram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return 	 "┌──────────────────── 주문확인서 ────────────────────┐"
			 + "\n   메뉴 : " + menu + "\n"
			 + "\n   소고기 : " + beef + ", 양고기 : " + ramb + ", 곱창 : " + intestines
			+ ",\n   대창 : " + bigIntestines + ", 양 : " + rectum + ", 막창 : " + tripe
			+ ",\n   새우 : " + shrimp + ",오징어 : " + squid + ", 피쉬볼 : " + fishBall
			+ ",\n   맛살 : " + crapMeat + ", 어묵 : " + fishCakes + ", 만두 : " + dumpling
			+ ",\n   소세지 : " + sausage + ", 햄 : " + ham + ", 유부 : " + frideTofu
			+ ",\n   두부 : " + tofu + ", 포두부 : " + dryTofu + ", 푸주 : " + driedBeanCurd
			+ ",\n   청경채 : " + bokChoy + ", 알배추 : " + napaCabbage + ", 고수 : "+ cilantro
			+ ",\n   숙주 : " + beanSprouts + " 콩나물 : " + soybeanSprout + ", 감자 : " + potato
			+ ",\n   단호박 : " + sweetPumpkin + ", 연근 : " + lotusRoot + ", 죽순 : " + bambooShoot
			+ ",\n   팽이버섯 : " + enokiMushroom + ",목이버섯 : " + woodEarMushroom + ", 새송이버섯 : " + kingOysterMushroom
			+ ",\n   흰목이버섯 : " + whiteWoodEarMushroom + ", 표고버섯 : " + ShiitakeMushroom + ",느타리버섯 : " + oysterMushroom
			+ ",\n   중국당면 : " + ChineseGlassNoodle + ", 넙적당면 : "+ flatNoodle + ",당면 : " + cellophaneNoodle
			+ ",\n   옥수수면 : " + cornNoodle + ",분모자 : " + fenHaoziNoodle + ", 수제비 : " + wheatFlakesNoodles
			+ ",\n   0단계 담백한맛(백탕) : "+ Whitesoop + ",1단계 약간 매운맛 : " + littleSpicy
			+ ",\n   2단계 매운맛 : " + Spicy + ", 3단계 아주 매운맛 : " + verySpicy
			+ ",\n   꿔바로우 小 : " + SweetAndSourPork + ", 꿔바로우 大  : " + bigSweetAndSourPork
			+ ",\n   볶음밥 : " + friedRice + ", 공기밥 : " + steamedRice
			+ ",\n   콜라 : " + coke + ",  사이다 : " + cider
			+ ",\n   소주 : " + soju + ",  맥주 : " + beer
			+ ",\n   중량  : " + gram +"g" +  ", 가격 : " + price + "원"
			+ ",\n└────────────────────────────────────────────────────┘\n";
		
	}
	


}











