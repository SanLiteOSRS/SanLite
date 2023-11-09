import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
final class class489 implements class486 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -212008943
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltz;B)V",
		garbageValue = "71"
	)
	public void vmethod8774(Object var1, Buffer var2) {
		this.method8746((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)Ljava/lang/Object;",
		garbageValue = "-190288914"
	)
	public Object vmethod8773(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Ltz;I)V",
		garbageValue = "-683011741"
	)
	void method8746(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1160932965"
	)
	static void method8753() {
		Login.Login_username = Login.Login_username.trim(); // L: 1255
		if (Login.Login_username.length() == 0) { // L: 1256
			class478.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1257
		} else {
			long var1 = VerticalAlignment.method3753(); // L: 1261
			int var0;
			if (0L == var1) { // L: 1262
				var0 = 5;
			} else {
				var0 = WorldMapSection2.method5087(var1, Login.Login_username); // L: 1263
			}

			switch(var0) { // L: 1264
			case 2:
				class478.setLoginResponseString(class349.field4052, class349.field4128, class349.field4146); // L: 1275
				class390.method7249(6); // L: 1276
				break; // L: 1277
			case 3:
				class478.setLoginResponseString("", "Error connecting to server.", ""); // L: 1282
				break;
			case 4:
				class478.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1279
				break; // L: 1280
			case 5:
				class478.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1266
				break;
			case 6:
				class478.setLoginResponseString("", "Error connecting to server.", ""); // L: 1269
				break; // L: 1270
			case 7:
				class478.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1272
			}

		}
	} // L: 1258 1285
}
