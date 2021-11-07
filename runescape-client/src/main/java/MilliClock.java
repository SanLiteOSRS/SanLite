import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("i")
	long[] field1581;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1278293949
	)
	int field1585;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1723820895
	)
	int field1583;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -2827552193639050909L
	)
	long field1584;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1430749655
	)
	int field1582;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1845625337
	)
	int field1586;

	public MilliClock() {
		this.field1581 = new long[10];
		this.field1585 = 256;
		this.field1583 = 1;
		this.field1582 = 0;
		this.field1584 = class111.method2516();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1581[var1] = this.field1584;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1421350581"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1581[var1] = 0L;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1121035205"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1585;
		int var4 = this.field1583;
		this.field1585 = 300;
		this.field1583 = 1;
		this.field1584 = class111.method2516();
		if (this.field1581[this.field1586] == 0L) {
			this.field1585 = var3;
			this.field1583 = var4;
		} else if (this.field1584 > this.field1581[this.field1586]) {
			this.field1585 = (int)((long)(var1 * 2560) / (this.field1584 - this.field1581[this.field1586]));
		}

		if (this.field1585 < 25) {
			this.field1585 = 25;
		}

		if (this.field1585 > 256) {
			this.field1585 = 256;
			this.field1583 = (int)((long)var1 - (this.field1584 - this.field1581[this.field1586]) / 10L);
		}

		if (this.field1583 > var1) {
			this.field1583 = var1;
		}

		this.field1581[this.field1586] = this.field1584;
		this.field1586 = (this.field1586 + 1) % 10;
		int var5;
		if (this.field1583 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1581[var5]) {
					this.field1581[var5] += (long)this.field1583;
				}
			}
		}

		if (this.field1583 < var2) {
			this.field1583 = var2;
		}

		FloorUnderlayDefinition.method3190((long)this.field1583);

		for (var5 = 0; this.field1582 < 256; this.field1582 += this.field1585) {
			++var5;
		}

		this.field1582 &= 255;
		return var5;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "1919228175"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					Throwable var4 = var1;
					String var5;
					if (var1 instanceof RunException) {
						RunException var6 = (RunException)var1;
						var5 = var6.message + " | ";
						var4 = var6.throwable;
					} else {
						var5 = "";
					}

					StringWriter var18 = new StringWriter();
					PrintWriter var7 = new PrintWriter(var18);
					var4.printStackTrace(var7);
					var7.close();
					String var8 = var18.toString();
					BufferedReader var9 = new BufferedReader(new StringReader(var8));
					String var10 = var9.readLine();

					label62:
					while (true) {
						while (true) {
							String var11 = var9.readLine();
							if (var11 == null) {
								var5 = var5 + "| " + var10;
								var2 = var5;
								break label62;
							}

							int var12 = var11.indexOf(40);
							int var13 = var11.indexOf(41, var12 + 1);
							if (var12 >= 0 && var13 >= 0) {
								String var14 = var11.substring(var12 + 1, var13);
								int var15 = var14.indexOf(".java:");
								if (var15 >= 0) {
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
									var5 = var5 + var14 + ' ';
									continue;
								}

								var11 = var11.substring(0, var12);
							}

							var11 = var11.trim();
							var11 = var11.substring(var11.lastIndexOf(32) + 1);
							var11 = var11.substring(var11.lastIndexOf(9) + 1);
							var5 = var5 + var11 + ' ';
						}
					}
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + GrandExchangeOfferAgeComparator.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2);
				DataInputStream var17 = new DataInputStream(var3.openStream());
				var17.read();
				var17.close();
			} catch (Exception var16) {
			}

		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)Ljava/lang/String;",
		garbageValue = "-102"
	)
	public static String method2955(Buffer var0) {
		return AbstractWorldMapData.method3956(var0, 32767);
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-32506034"
	)
	static void method2954(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class321.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
