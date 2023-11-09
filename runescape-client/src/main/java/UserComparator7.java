import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = -1947823007
	)
	static int field1374;
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;I)I",
		garbageValue = "1935298638"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "-33"
	)
	static Date method2563() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1098
		var0.set(2, 0); // L: 1099
		var0.set(5, 1); // L: 1100
		var0.set(1, 1900); // L: 1101
		return var0.getTime(); // L: 1102
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1360388184"
	)
	static void method2558() {
		Login.Login_username = Login.Login_username.trim(); // L: 1196
		if (Login.Login_username.length() == 0) { // L: 1197
			ItemComposition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1198
		} else {
			long var1;
			try {
				URL var3 = new URL(ModeWhere.method6005("services", false) + "m=accountappeal/login.ws"); // L: 1205
				URLConnection var4 = var3.openConnection(); // L: 1206
				var4.setRequestProperty("connection", "close"); // L: 1207
				var4.setDoInput(true); // L: 1208
				var4.setDoOutput(true); // L: 1209
				var4.setConnectTimeout(5000); // L: 1210
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 1211
				var5.write("data1=req"); // L: 1212
				var5.flush(); // L: 1213
				InputStream var6 = var4.getInputStream(); // L: 1214
				Buffer var7 = new Buffer(new byte[1000]); // L: 1215

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 1217
					if (var8 == -1) { // L: 1218
						var7.offset = 0; // L: 1225
						long var10 = var7.readLong(); // L: 1226
						var1 = var10; // L: 1227
						break;
					}

					var7.offset += var8; // L: 1219
					if (var7.offset >= 1000) { // L: 1220
						var1 = 0L; // L: 1221
						break;
					}
				}
			} catch (Exception var14) { // L: 1229
				var1 = 0L; // L: 1230
			}

			int var0;
			if (0L == var1) { // L: 1234
				var0 = 5;
			} else {
				var0 = WorldMapSection0.method4852(var1, Login.Login_username); // L: 1235
			}

			switch(var0) { // L: 1236
			case 2:
				ItemComposition.setLoginResponseString(Strings.field3894, Strings.field3687, Strings.field3762); // L: 1253
				class116.method2683(6); // L: 1254
				break;
			case 3:
				ItemComposition.setLoginResponseString("", "Error connecting to server.", ""); // L: 1238
				break; // L: 1239
			case 4:
				ItemComposition.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1250
				break; // L: 1251
			case 5:
				ItemComposition.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1241
				break; // L: 1242
			case 6:
				ItemComposition.setLoginResponseString("", "Error connecting to server.", ""); // L: 1244
				break; // L: 1245
			case 7:
				ItemComposition.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1247
			}

		}
	} // L: 1199 1257

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Lkn;III)V",
		garbageValue = "-1583696044"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10406
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10407
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10408
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10409
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10410
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10411
		}

		if (var0.yAlignment == 0) { // L: 10412
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10413
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10414
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10415
		} else if (var0.yAlignment == 4) { // L: 10416
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10417
		}

	} // L: 10418
}
