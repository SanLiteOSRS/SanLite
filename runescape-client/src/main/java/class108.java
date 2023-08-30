import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class108 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1393;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1392;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1398;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1394;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1391;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1396;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1407;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1397;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1400;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1395;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1401;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1402;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1403;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1404;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1399;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1406;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1016712981
	)
	int field1405;

	static {
		field1393 = new class108(0); // L: 1947
		field1392 = new class108(1); // L: 1948
		field1398 = new class108(2); // L: 1949
		field1394 = new class108(3); // L: 1950
		field1391 = new class108(4); // L: 1951
		field1396 = new class108(5); // L: 1952
		field1407 = new class108(6); // L: 1953
		field1397 = new class108(7); // L: 1954
		field1400 = new class108(8); // L: 1955
		field1395 = new class108(9); // L: 1956
		field1401 = new class108(10); // L: 1957
		field1402 = new class108(11); // L: 1958
		field1403 = new class108(12); // L: 1959
		field1404 = new class108(13); // L: 1960
		field1399 = new class108(14); // L: 1961
		field1406 = new class108(15); // L: 1962
	}

	class108(int var1) {
		this.field1405 = var1; // L: 1966
	} // L: 1967

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	static void method2715() {
		Login.Login_username = Login.Login_username.trim(); // L: 1156
		if (Login.Login_username.length() == 0) { // L: 1157
			class318.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1158
		} else {
			long var1;
			try {
				URL var3 = new URL(HorizontalAlignment.method3682("services", false) + "m=accountappeal/login.ws"); // L: 1165
				URLConnection var4 = var3.openConnection(); // L: 1166
				var4.setRequestProperty("connection", "close"); // L: 1167
				var4.setDoInput(true); // L: 1168
				var4.setDoOutput(true); // L: 1169
				var4.setConnectTimeout(5000); // L: 1170
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 1171
				var5.write("data1=req"); // L: 1172
				var5.flush(); // L: 1173
				InputStream var6 = var4.getInputStream(); // L: 1174
				Buffer var7 = new Buffer(new byte[1000]); // L: 1175

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 1177
					if (var8 == -1) { // L: 1178
						var7.offset = 0; // L: 1185
						long var10 = var7.readLong(); // L: 1186
						var1 = var10; // L: 1187
						break;
					}

					var7.offset += var8; // L: 1179
					if (var7.offset >= 1000) { // L: 1180
						var1 = 0L; // L: 1181
						break;
					}
				}
			} catch (Exception var14) { // L: 1189
				var1 = 0L; // L: 1190
			}

			int var0;
			if (var1 == 0L) { // L: 1194
				var0 = 5;
			} else {
				var0 = class318.method6018(var1, Login.Login_username); // L: 1195
			}

			switch(var0) { // L: 1196
			case 2:
				class318.setLoginResponseString(class351.field4176, class351.field4177, class351.field4178); // L: 1198
				PcmPlayer.method838(6); // L: 1199
				break; // L: 1200
			case 3:
				class318.setLoginResponseString("", "Error connecting to server.", ""); // L: 1208
				break; // L: 1209
			case 4:
				class318.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1214
				break;
			case 5:
				class318.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1202
				break; // L: 1203
			case 6:
				class318.setLoginResponseString("", "Error connecting to server.", ""); // L: 1211
				break; // L: 1212
			case 7:
				class318.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1205
			}

		}
	} // L: 1159 1217

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-154699452"
	)
	static final void method2716(boolean var0) {
		class301.method5721(); // L: 5898
		++Client.packetWriter.pendingWrites; // L: 5899
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5900
			Client.packetWriter.pendingWrites = 0; // L: 5901
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5902
				PacketBufferNode var1 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 5904
				Client.packetWriter.addNode(var1); // L: 5905

				try {
					Client.packetWriter.flush(); // L: 5907
				} catch (IOException var3) { // L: 5909
					Client.hadNetworkError = true; // L: 5910
				}
			}

		}
	} // L: 5913
}
