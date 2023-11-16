import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;B)I",
		garbageValue = "26"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1918308972"
	)
	public static int method2943(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 30
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 31
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 32
		var0 += var0 >>> 8; // L: 33
		var0 += var0 >>> 16; // L: 34
		return var0 & 255; // L: 35
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lnn;II)I",
		garbageValue = "1187363281"
	)
	static final int method2942(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11322
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11324
				int var3 = 0; // L: 11325
				int var4 = 0; // L: 11326
				byte var5 = 0; // L: 11327

				while (true) {
					int var6 = var2[var4++]; // L: 11329
					int var7 = 0; // L: 11330
					byte var8 = 0; // L: 11331
					if (var6 == 0) { // L: 11332
						return var3;
					}

					if (var6 == 1) { // L: 11333
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11334
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11335
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11336
						var9 = var2[var4++] << 16; // L: 11337
						var9 += var2[var4++]; // L: 11338
						var10 = HealthBarDefinition.field1877.method6285(var9); // L: 11339
						var11 = var2[var4++]; // L: 11340
						if (var11 != -1 && (!class214.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11341
							for (var12 = 0; var12 < var10.field3790.length; ++var12) { // L: 11342
								if (var11 + 1 == var10.field3790[var12]) { // L: 11343
									var7 += var10.field3791[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11347
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11348
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11349
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11350
						var7 = class229.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11351
						for (var9 = 0; var9 < 25; ++var9) { // L: 11352
							if (Skills.Skills_enabled[var9]) { // L: 11353
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11356
						var9 = var2[var4++] << 16; // L: 11357
						var9 += var2[var4++]; // L: 11358
						var10 = HealthBarDefinition.field1877.method6285(var9); // L: 11359
						var11 = var2[var4++]; // L: 11360
						if (var11 != -1 && (!class214.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11361
							for (var12 = 0; var12 < var10.field3790.length; ++var12) { // L: 11362
								if (var11 + 1 == var10.field3790[var12]) { // L: 11363
									var7 = 999999999; // L: 11364
									break; // L: 11365
								}
							}
						}
					}

					if (var6 == 11) { // L: 11370
						var7 = Client.field663;
					}

					if (var6 == 12) { // L: 11371
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11372
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11373
						int var13 = var2[var4++]; // L: 11374
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11375
					}

					if (var6 == 14) { // L: 11377
						var9 = var2[var4++]; // L: 11378
						var7 = HealthBar.getVarbit(var9); // L: 11379
					}

					if (var6 == 15) { // L: 11381
						var8 = 1;
					}

					if (var6 == 16) { // L: 11382
						var8 = 2;
					}

					if (var6 == 17) { // L: 11383
						var8 = 3;
					}

					if (var6 == 18) { // L: 11384
						var7 = class187.baseX * 64 + (class229.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11385
						var7 = class101.baseY * 64 + (class229.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11386
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11387
						if (var5 == 0) { // L: 11388
							var3 += var7;
						}

						if (var5 == 1) { // L: 11389
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11390
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11391
							var3 *= var7;
						}

						var5 = 0; // L: 11392
					} else {
						var5 = var8; // L: 11394
					}
				}
			} catch (Exception var14) { // L: 11397
				return -1; // L: 11398
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "52"
	)
	static final void method2936(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12722
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3479()) { // L: 12723
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12724
				if (var2.rank == -1) {
					PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.field3212, Client.packetWriter.isaacCipher); // L: 12726
					var3.packetBuffer.writeByte(3 + ClanChannel.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12727
					var3.packetBuffer.writeByte(var0); // L: 12728
					var3.packetBuffer.writeShort(var1); // L: 12729
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12730
					Client.packetWriter.addNode(var3); // L: 12731
				}
			}
		}
	} // L: 12725 12732

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(II)Lte;",
		garbageValue = "-125616841"
	)
	static class518 method2937(int var0) {
		class518 var1 = (class518)Client.Widget_cachedFonts.get((long)var0); // L: 12962
		if (var1 == null) { // L: 12963
			var1 = new class518(class267.field2778, var0); // L: 12964
		}

		return var1; // L: 12966
	}
}
