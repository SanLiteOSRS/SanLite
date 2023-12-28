import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
public class class520 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1327153605
	)
	static final int field5086;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 362152811
	)
	static final int field5087;
	@ObfuscatedName("aa")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;

	static {
		field5086 = (int)(Math.pow(2.0D, 4.0D) - 1.0D); // L: 10
		field5087 = (int)(Math.pow(2.0D, 8.0D) - 1.0D); // L: 11
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lly;",
		garbageValue = "-51"
	)
	public static class306[] method9189() {
		return new class306[]{class306.field3232, class306.field3226, class306.field3228, class306.field3230, class306.field3225, class306.field3234, class306.field3231, class306.field3227, class306.field3233, class306.field3229, class306.field3235, class306.field3236, class306.field3237}; // L: 20
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "-1924207396"
	)
	static String method9185(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 68
			RunException var2 = (RunException)var0; // L: 69
			var1 = var2.message + " | "; // L: 70
			var0 = var2.throwable; // L: 71
		} else {
			var1 = ""; // L: 73
		}

		StringWriter var12 = new StringWriter(); // L: 74
		PrintWriter var3 = new PrintWriter(var12); // L: 75
		var0.printStackTrace(var3); // L: 76
		var3.close(); // L: 77
		String var4 = var12.toString(); // L: 78
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 79
		String var6 = var5.readLine(); // L: 80

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 82
				if (var7 == null) { // L: 83
					var1 = var1 + "| " + var6; // L: 101
					return var1; // L: 102
				}

				int var8 = var7.indexOf(40); // L: 84
				int var9 = var7.indexOf(41, var8 + 1); // L: 85
				if (var8 >= 0 && var9 >= 0) { // L: 86
					String var10 = var7.substring(var8 + 1, var9); // L: 87
					int var11 = var10.indexOf(".java:"); // L: 88
					if (var11 >= 0) { // L: 89
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 90
						var1 = var1 + var10 + ' '; // L: 91
						continue; // L: 92
					}

					var7 = var7.substring(0, var8); // L: 94
				}

				var7 = var7.trim(); // L: 96
				var7 = var7.substring(var7.lastIndexOf(32) + 1); // L: 97
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 98
				var1 = var1 + var7 + ' '; // L: 99
			}
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "471269719"
	)
	static final void method9190() {
		PacketBufferNode var0 = class113.getPacketBufferNode(ClientPacket.field3214, Client.packetWriter.isaacCipher); // L: 12461
		Client.packetWriter.addNode(var0); // L: 12462
		Interpreter.field842 = true; // L: 12463

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12464
			if (var1.type == 0 || var1.type == 3) { // L: 12465
				class302.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12467
			class159.invalidateWidget(Client.meslayerContinueWidget); // L: 12468
			Client.meslayerContinueWidget = null; // L: 12469
		}

		Interpreter.field842 = false; // L: 12471
	} // L: 12472
}
