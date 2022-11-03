import java.awt.FontMetrics;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class10 {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	static ClanSettings field56;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1116853935
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ac")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("a")
	HttpsURLConnection field53;
	@ObfuscatedName("f")
	final Map field59;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	class418 field52;
	@ObfuscatedName("x")
	Map field51;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	final class9 field54;
	@ObfuscatedName("j")
	boolean field55;
	@ObfuscatedName("y")
	boolean field50;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1255809723
	)
	int field57;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lr;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this.field55 = false; // L: 20
		this.field50 = false; // L: 21
		this.field57 = 300000; // L: 22
		if (!var2.method73()) { // L: 25
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method70());
		} else {
			this.field53 = (HttpsURLConnection)var1.openConnection(); // L: 26
			if (!var3) { // L: 27
				HttpsURLConnection var4 = this.field53; // L: 28
				if (class15.field81 == null) { // L: 31
					class15.field81 = new class15(); // L: 32
				}

				class15 var5 = class15.field81; // L: 34
				var4.setSSLSocketFactory(var5); // L: 36
			}

			this.field54 = var2; // L: 38
			this.field59 = new HashMap(); // L: 39
			this.field51 = new HashMap(); // L: 40
		}
	} // L: 41

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "3"
	)
	public void method79(String var1, String var2) {
		if (!this.field55) { // L: 44
			this.field59.put(var1, var2); // L: 45
		}
	} // L: 46

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1448491896"
	)
	String method80() {
		ArrayList var1 = new ArrayList(this.field51.entrySet()); // L: 49
		Collections.sort(var1, new class18(this)); // L: 50
		StringBuilder var2 = new StringBuilder(); // L: 63
		Iterator var3 = var1.iterator(); // L: 64

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 65
			if (var2.length() > 0) { // L: 67
				var2.append(",");
			}

			var2.append(((class417)var4.getKey()).method7779()); // L: 68
			float var5 = (Float)var4.getValue(); // L: 69
			if (var5 < 1.0F) { // L: 70
				String var6 = Float.toString(var5).substring(0, 4); // L: 71
				var2.append(";q=" + var6); // L: 72
			}
		}

		return var2.toString(); // L: 76
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-894417470"
	)
	void method78() throws ProtocolException {
		if (!this.field55) { // L: 80
			this.field53.setRequestMethod(this.field54.method70());
			if (!this.field51.isEmpty()) {
				this.field59.put("Accept", this.method80());
			}

			Iterator var1 = this.field59.entrySet().iterator();

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next();
				this.field53.setRequestProperty((String)var2.getKey(), (String)var2.getValue());
			}

			if (this.field54.method62() && this.field52 != null) {
				this.field53.setDoOutput(true); // L: 90
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();

				try {
					var13.write(this.field52.vmethod7797()); // L: 93
					var13.writeTo(this.field53.getOutputStream()); // L: 94
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					if (var13 != null) {
						try {
							var13.close();
						} catch (IOException var10) { // L: 104
							var10.printStackTrace();
						}
					}

				}
			}

			this.field53.setConnectTimeout(this.field57);
			this.field53.setInstanceFollowRedirects(this.field50);
			this.field55 = true; // L: 112
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "820553438"
	)
	boolean method84() throws IOException, SocketTimeoutException {
		if (!this.field55) {
			this.method78();
		}

		this.field53.connect();
		return this.field53.getResponseCode() == -1; // L: 118
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Li;",
		garbageValue = "1461670023"
	)
	class21 method83() {
		try {
			if (!this.field55 || this.field53.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field53.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage()); // L: 128
		}

		class21 var1 = null;

		class21 var3;
		try {
			var1 = new class21(this.field53);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field53.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Lbt;II[I[II)V",
		garbageValue = "-1552533114"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 81
			int var5 = var1 - 1; // L: 82
			int var6 = var2 + 1; // L: 83
			int var7 = (var2 + var1) / 2; // L: 84
			World var8 = var0[var7]; // L: 85
			var0[var7] = var0[var1]; // L: 86
			var0[var1] = var8; // L: 87

			while (var5 < var6) { // L: 88
				boolean var9 = true; // L: 89

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 91

					for (var10 = 0; var10 < 4; ++var10) { // L: 92
						if (var3[var10] == 2) { // L: 95
							var11 = var0[var6].index; // L: 96
							var12 = var8.index; // L: 97
						} else if (var3[var10] == 1) { // L: 99
							var11 = var0[var6].population; // L: 100
							var12 = var8.population; // L: 101
							if (var11 == -1 && var4[var10] == 1) { // L: 102
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 103
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 105
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 106
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 107
						} else {
							var11 = var0[var6].id; // L: 110
							var12 = var8.id; // L: 111
						}

						if (var11 != var12) { // L: 113
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 116 117
								var9 = false; // L: 119
							}
							break;
						}

						if (var10 == 3) { // L: 114
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 124

				do {
					++var5; // L: 126

					for (var10 = 0; var10 < 4; ++var10) { // L: 127
						if (var3[var10] == 2) { // L: 130
							var11 = var0[var5].index; // L: 131
							var12 = var8.index; // L: 132
						} else if (var3[var10] == 1) { // L: 134
							var11 = var0[var5].population; // L: 135
							var12 = var8.population; // L: 136
							if (var11 == -1 && var4[var10] == 1) { // L: 137
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 138
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var12 != var11) { // L: 148
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 151 152
								var9 = false; // L: 154
							}
							break;
						}

						if (var10 == 3) { // L: 149
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 159
					World var13 = var0[var5]; // L: 160
					var0[var5] = var0[var6]; // L: 161
					var0[var6] = var13; // L: 162
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 165
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 166
		}

	} // L: 168

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "870241653"
	)
	static void method93(int var0) {
		PendingSpawn.tempMenuAction = new MenuAction(); // L: 12041
		PendingSpawn.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 12042
		PendingSpawn.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 12043
		PendingSpawn.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 12044
		PendingSpawn.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 12045
		PendingSpawn.tempMenuAction.field883 = Client.field647[var0]; // L: 12046
		PendingSpawn.tempMenuAction.field884 = Client.menuActions[var0]; // L: 12047
		PendingSpawn.tempMenuAction.action = Client.menuTargets[var0]; // L: 12048
	} // L: 12049
}
