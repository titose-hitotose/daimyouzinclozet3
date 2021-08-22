package daimyouzinclozet3.proxy;

public class CommonProxy {

	 /* エンティティの登録、コンフィグ読込など
	    * Register Entity and Config. */
	    public void preInit() {

	    }

	    /* レシピ・鉱石などの追加 Register Recipe and Ore. */
	    public void init() { }

	    /* 他Modとの連携 Cooperation with other Mod. */
	    public void postInit() { }

	    /* シングルプレイかどうか Single play or not? */
	    public boolean isSinglePlayer() {
	        return false;
	    }

	    /* サーバープレイかどうか Sever play or not? */
	    public boolean isDedicatedServer() {
	        return true;
	    }


}
