import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class130 implements Callable {
	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class131 field1555;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class132 field1554;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	final class133 field1556;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2141685417
	)
	final int field1553;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;Lfm;Lfd;Lfe;I)V"
	)
	class130(class138 var1, class131 var2, class132 var3, class133 var4, int var5) {
		this.this$0 = var1; // L: 229
		this.field1555 = var2; // L: 230
		this.field1554 = var3; // L: 231
		this.field1556 = var4; // L: 232
		this.field1553 = var5; // L: 233
	} // L: 234

	public Object call() {
		this.field1555.method3018(); // L: 238
		class131[][] var1;
		if (this.field1554 == class132.field1583) { // L: 240
			var1 = this.this$0.field1634; // L: 241
		} else {
			var1 = this.this$0.field1633; // L: 244
		}

		var1[this.field1553][this.field1556.method3061()] = this.field1555; // L: 246
		return null; // L: 247
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "-971784863"
	)
	public static String method3012(byte[] var0) {
		int var2 = var0.length; // L: 59
		StringBuilder var3 = new StringBuilder(); // L: 61

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) { // L: 62
			int var5 = var0[var4] & 255; // L: 63
			var3.append(class405.field4562[var5 >>> 2]); // L: 64
			if (var4 < var2 - 1) { // L: 65
				int var6 = var0[var4 + 1] & 255; // L: 66
				var3.append(class405.field4562[(var5 & 3) << 4 | var6 >>> 4]); // L: 67
				if (var4 < var2 - 2) { // L: 68
					int var7 = var0[var4 + 2] & 255; // L: 69
					var3.append(class405.field4562[(var6 & 15) << 2 | var7 >>> 6]).append(class405.field4562[var7 & 63]); // L: 70
				} else {
					var3.append(class405.field4562[(var6 & 15) << 2]).append("="); // L: 72
				}
			} else {
				var3.append(class405.field4562[(var5 & 3) << 4]).append("=="); // L: 74
			}
		}

		String var1 = var3.toString(); // L: 76
		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lif;",
		garbageValue = "1144972870"
	)
	static VerticalAlignment[] method3014() {
		return new VerticalAlignment[]{VerticalAlignment.field2156, VerticalAlignment.field2150, VerticalAlignment.VerticalAlignment_centered}; // L: 14
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([I[IIIS)V",
		garbageValue = "6741"
	)
	public static void method3015(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 77
			int var4 = (var3 + var2) / 2; // L: 78
			int var5 = var2; // L: 79
			int var6 = var0[var4]; // L: 80
			var0[var4] = var0[var3]; // L: 81
			var0[var3] = var6; // L: 82
			int var7 = var1[var4]; // L: 83
			var1[var4] = var1[var3]; // L: 84
			var1[var3] = var7; // L: 85
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1; // L: 86

			for (int var9 = var2; var9 < var3; ++var9) { // L: 87
				if (var0[var9] < (var9 & var8) + var6) { // L: 88
					int var10 = var0[var9]; // L: 89
					var0[var9] = var0[var5]; // L: 90
					var0[var5] = var10; // L: 91
					int var11 = var1[var9]; // L: 92
					var1[var9] = var1[var5]; // L: 93
					var1[var5++] = var11; // L: 94
				}
			}

			var0[var3] = var0[var5]; // L: 98
			var0[var5] = var6; // L: 99
			var1[var3] = var1[var5]; // L: 100
			var1[var5] = var7; // L: 101
			method3015(var0, var1, var2, var5 - 1); // L: 102
			method3015(var0, var1, var5 + 1, var3); // L: 103
		}

	} // L: 105

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1009669422"
	)
	static boolean method3011() {
		Date var0;
		try {
			var0 = MouseHandler.method655(); // L: 1075
		} catch (ParseException var4) { // L: 1077
			class145.method3156("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1078
			return false; // L: 1079
		}

		if (var0 == null) { // L: 1081
			return false; // L: 1082
		} else {
			boolean var3 = class160.method3354(var0); // L: 1084
			boolean var2 = class348.method6644(var0); // L: 1085
			if (!var2) { // L: 1086
				class145.method3156("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1087
				return false; // L: 1088
			} else {
				if (!var3) { // L: 1090
					class332.field3603 = 8388607; // L: 1091
				} else {
					class332.field3603 = (int)(var0.getTime() / 86400000L - 11745L); // L: 1094
				}

				return true; // L: 1096
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1492906481"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!UrlRequest.client.method1531() && !UrlRequest.client.isOtlTokenRequesterInitialized() && !UrlRequest.client.method1211()) { // L: 1151
			Login.Login_response1 = ""; // L: 1155
			Login.Login_response2 = "Enter your username/email & password."; // L: 1156
			Login.Login_response3 = ""; // L: 1157
			class210.method3930(2); // L: 1158
			if (var0) { // L: 1159
				Login.Login_password = "";
			}

			class7.method44(); // L: 1160
			Friend.method8099(); // L: 1161
		} else {
			class210.method3930(10); // L: 1152
		}
	} // L: 1153 1162

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "936667859"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 620
		if (Occluder.garbageCollector == null || !Occluder.garbageCollector.isValid()) { // L: 621
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 623

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 624
					if (var2.isValid()) { // L: 626
						Occluder.garbageCollector = var2; // L: 627
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 628
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 629
					}
				}
			} catch (Throwable var11) { // L: 634
			}
		}

		if (Occluder.garbageCollector != null) { // L: 636
			long var9 = VerticalAlignment.method3924(); // L: 637
			long var3 = Occluder.garbageCollector.getCollectionTime(); // L: 638
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 639
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 640
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 641
				if (0L != var7) { // L: 642
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 644
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 645
		}

		return var0; // L: 647
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIIIIII)V",
		garbageValue = "1652512334"
	)
	static final void method3010(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field601) { // L: 11256
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11257
		}

		Client.field601 = false; // L: 11258
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11259
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11260
				var0.scrollY -= 4; // L: 11261
				WorldMapData_0.invalidateWidget(var0); // L: 11262
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11264
				var0.scrollY += 4; // L: 11265
				WorldMapData_0.invalidateWidget(var0); // L: 11266
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11268
				var7 = var3 * (var3 - 32) / var4; // L: 11269
				if (var7 < 8) { // L: 11270
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11271
				int var9 = var3 - 32 - var7; // L: 11272
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11273
				WorldMapData_0.invalidateWidget(var0); // L: 11274
				Client.field601 = true; // L: 11275
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11278
			var7 = var0.width; // L: 11279
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11280
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11281
				WorldMapData_0.invalidateWidget(var0); // L: 11282
			}
		}

	} // L: 11285
}
