import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("am")
	byte[] field3446;
	@ObfuscatedName("ap")
	byte[] field3445;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2073587451
	)
	int field3453;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1357198507
	)
	int field3448;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1563895247
	)
	int field3447;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1696962409
	)
	int field3450;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1478653309
	)
	int field3451;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -233143541
	)
	int field3452;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 290476327
	)
	int field3449;

	MusicPatchNode2() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;IB)Lmc;",
		garbageValue = "-46"
	)
	static MusicPatch method6039(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 25
		return var2 == null ? null : new MusicPatch(var2); // L: 26
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;B)V",
		garbageValue = "-76"
	)
	public static void method6040(AbstractArchive var0) {
	} // L: 14

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-123"
	)
	static final int method6036() {
		return ViewportMouse.ViewportMouse_y; // L: 106
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	static void method6037() {
		Login.Login_username = Login.Login_username.trim(); // L: 1250
		if (Login.Login_username.length() == 0) { // L: 1251
			class142.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1252
		} else {
			long var1 = class185.method3710(); // L: 1256
			int var0;
			if (0L == var1) { // L: 1257
				var0 = 5;
			} else {
				var0 = class11.method101(var1, Login.Login_username); // L: 1258
			}

			switch(var0) { // L: 1259
			case 2:
				class142.setLoginResponseString(class366.field4239, class366.field4065, class366.field4241); // L: 1270
				Actor.method2489(6); // L: 1271
				break; // L: 1272
			case 3:
				class142.setLoginResponseString("", "Error connecting to server.", ""); // L: 1267
				break; // L: 1268
			case 4:
				class142.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1261
				break;
			case 5:
				class142.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1264
				break; // L: 1265
			case 6:
				class142.setLoginResponseString("", "Error connecting to server.", ""); // L: 1277
				break;
			case 7:
				class142.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1274
			}

		}
	} // L: 1253 1280

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-933399972"
	)
	static final String method6038(int var0, int var1) {
		int var2 = var1 - var0; // L: 10472
		if (var2 < -9) { // L: 10473
			return class208.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 10474
			return class208.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 10475
			return class208.colorStartTag(16740352);
		} else if (var2 < 0) { // L: 10476
			return class208.colorStartTag(16756736);
		} else if (var2 > 9) { // L: 10477
			return class208.colorStartTag(65280);
		} else if (var2 > 6) { // L: 10478
			return class208.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 10479
			return class208.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class208.colorStartTag(12648192) : class208.colorStartTag(16776960); // L: 10480 10481
		}
	}
}
