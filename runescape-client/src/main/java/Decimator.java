import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1297772145
	)
	static int field400;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1717776155
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1324550705
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ax")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = class156.method3269(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.inputRate = var1; // L: 18
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4]; // L: 22
				double var6 = (double)var4 / (double)var1 + 6.0D; // L: 23
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D)); // L: 24
				if (var8 < 0) { // L: 25
					var8 = 0;
				}

				int var9 = (int)Math.ceil(var6 + 7.0D);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = 3.141592653589793D * ((double)var8 - var6);
					double var14 = var10; // L: 31
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
					var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
				}
			}

		}
	} // L: 37

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "743221053"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 40
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 41
			int[] var3 = new int[var2]; // L: 42
			int var4 = 0; // L: 43
			int var5 = 0; // L: 44

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 45
				byte var7 = var1[var6]; // L: 46
				int[] var8 = this.table[var5]; // L: 47

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 48
					var3[var9 + var4] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 49
				var9 = var5 / this.inputRate; // L: 50
				var4 += var9; // L: 51
				var5 -= var9 * this.inputRate; // L: 52
			}

			var1 = new byte[var2]; // L: 54

			for (var6 = 0; var6 < var2; ++var6) { // L: 55
				int var10 = var3[var6] + 32768 >> 16; // L: 56
				if (var10 < -128) { // L: 57
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 58
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 59
				}
			}
		}

		return var1; // L: 62
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-49"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate); // L: 66
		}

		return var1; // L: 67
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "71"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-310371994"
	)
	public static void method1093() {
		class217.field2388 = new class215[1]; // L: 11
		class213[] var1 = class213.field2365; // L: 15
		int var2 = 0;

		class213 var0;
		while (true) {
			if (var2 >= var1.length) {
				var0 = null; // L: 26
				break;
			}

			class213 var3 = var1[var2]; // L: 17
			if (0 <= var3.field2363 && 0 <= var3.field2353) { // L: 19
				var0 = var3; // L: 20
				break;
			}

			++var2; // L: 16
		}

		class217.field2388[0] = new class215(var0.field2364, var0.field2361);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "69"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 27
		if (var4 == null) { // L: 28
			var4 = new ChatChannel(); // L: 29
			Messages.Messages_channels.put(var0, var4); // L: 30
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 32
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 33
		Messages.Messages_queue.add(var5); // L: 34
		Client.chatCycle = Client.cycleCntr; // L: 35
	} // L: 36

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "749814335"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (WorldMapManager.clientPreferences.method2442() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3722
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3723
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3724
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3725
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3726
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3727
			++Client.soundEffectCount; // L: 3728
		}

	} // L: 3730

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "14"
	)
	public static void method1104(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class251.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher); // L: 12565
		var4.packetBuffer.method9002(var1); // L: 12566
		var4.packetBuffer.writeByte(var2); // L: 12567
		var4.packetBuffer.method9004(var0); // L: 12568
		var4.packetBuffer.method9016(var3 ? Client.field578 : 0); // L: 12569
		Client.packetWriter.addNode(var4); // L: 12570
	} // L: 12571
}
