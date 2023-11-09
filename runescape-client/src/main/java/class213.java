import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class213 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class213 field2359;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class213 field2356;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class213 field2355;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class213 field2354;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class213 field2357;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class213 field2358;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class213 field2362;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lic;"
	)
	static final class213[] field2365;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -85985627
	)
	final int field2360;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 263344799
	)
	final int field2364;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1524833051
	)
	final int field2361;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -779008393
	)
	final int field2363;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1162148657
	)
	final int field2353;

	static {
		field2359 = new class213(4, 8, 8); // L: 8
		field2356 = new class213(3, 16, 16); // L: 9
		field2355 = new class213(2, 32, 32); // L: 10
		field2354 = new class213(6, 48, 48); // L: 11
		field2357 = new class213(5, 64, 64); // L: 12
		field2358 = new class213(0, 96, 96); // L: 13
		field2362 = new class213(1, 128, 128); // L: 14
		class213[] var0 = new class213[]{field2358, field2362, field2355, field2356, field2359, field2357, field2354}; // L: 25
		field2365 = var0; // L: 27
		Arrays.sort(field2365, new class218()); // L: 31
	} // L: 32

	class213(int var1, int var2, int var3) {
		this.field2360 = var1; // L: 35
		this.field2364 = var2; // L: 36
		this.field2361 = var3; // L: 37
		this.field2363 = this.field2364 / 2; // L: 38
		this.field2353 = this.field2361 / 2; // L: 39
	} // L: 40

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2030165448"
	)
	int method4151() {
		return this.field2364 * this.field2361; // L: 43
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(ZLtn;I)V",
		garbageValue = "-1469412407"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field671 = 0; // L: 8425
		Client.field542 = 0; // L: 8426
		var1.importIndex(); // L: 8428
		int var2 = var1.readBits(8); // L: 8429
		int var3;
		if (var2 < Client.npcCount) { // L: 8430
			for (var3 = var2; var3 < Client.npcCount; ++var3) { // L: 8431
				Client.field612[++Client.field671 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) { // L: 8433
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8434

			for (var3 = 0; var3 < var2; ++var3) { // L: 8435
				int var4 = Client.npcIndices[var3]; // L: 8436
				NPC var5 = Client.npcs[var4]; // L: 8437
				int var6 = var1.readBits(1); // L: 8438
				if (var6 == 0) { // L: 8439
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8440
					var5.npcCycle = Client.cycle; // L: 8441
				} else {
					int var7 = var1.readBits(2); // L: 8444
					if (var7 == 0) { // L: 8445
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8446
						var5.npcCycle = Client.cycle; // L: 8447
						Client.field512[++Client.field542 - 1] = var4; // L: 8448
					} else {
						int var8;
						int var9;
						if (var7 == 1) { // L: 8451
							Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8452
							var5.npcCycle = Client.cycle; // L: 8453
							var8 = var1.readBits(3); // L: 8454
							var5.method2557(var8, class216.field2381); // L: 8455
							var9 = var1.readBits(1); // L: 8456
							if (var9 == 1) { // L: 8457
								Client.field512[++Client.field542 - 1] = var4;
							}
						} else if (var7 == 2) { // L: 8460
							Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8461
							var5.npcCycle = Client.cycle; // L: 8462
							if (var1.readBits(1) == 1) { // L: 8463
								var8 = var1.readBits(3); // L: 8464
								var5.method2557(var8, class216.field2384); // L: 8465
								var9 = var1.readBits(3); // L: 8466
								var5.method2557(var9, class216.field2384); // L: 8467
							} else {
								var8 = var1.readBits(3); // L: 8470
								var5.method2557(var8, class216.field2380); // L: 8471
							}

							var8 = var1.readBits(1); // L: 8473
							if (var8 == 1) { // L: 8474
								Client.field512[++Client.field542 - 1] = var4;
							}
						} else if (var7 == 3) { // L: 8477
							Client.field612[++Client.field671 - 1] = var4; // L: 8478
						}
					}
				}
			}

			HealthBarUpdate.method2390(var0, var1); // L: 8483
			class85.method2238(var1); // L: 8484

			for (var2 = 0; var2 < Client.field671; ++var2) { // L: 8485
				var3 = Client.field612[var2]; // L: 8486
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8487
					Client.npcs[var3].definition = null; // L: 8488
					Client.npcs[var3] = null; // L: 8489
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8492
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 8493
			} else {
				for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 8495
					if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 8496
						throw new RuntimeException(var2 + "," + Client.npcCount); // L: 8497
					}
				}

			}
		}
	} // L: 8500
}
