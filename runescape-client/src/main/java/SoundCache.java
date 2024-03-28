import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field308;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = -1490751183
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field305;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field309;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256); // L: 11
		this.field309 = new NodeHashTable(256); // L: 14
		this.soundEffectIndex = var1; // L: 17
		this.field305 = var2; // L: 18
	} // L: 19

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbr;",
		garbageValue = "1763738474"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method827(var1, var2, false); // L: 22
		class53 var6 = (class53)this.field309.get(var4); // L: 23
		if (var6 != null) { // L: 24
			return var6.method1044();
		} else if (var3 != null && var3[0] <= 0) { // L: 25
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 26
			if (var7 == null) { // L: 27
				return null;
			} else {
				RawSound var8 = var7.toRawSound(); // L: 28
				this.field309.put(new class53(var8), var4); // L: 29
				if (var3 != null) { // L: 30
					var3[0] -= var8.samples.length;
				}

				return var8; // L: 31
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lcj;",
		garbageValue = "-199146739"
	)
	class53 method832(int var1, int var2) {
		long var3 = this.method827(var1, var2, true); // L: 35
		class53 var5 = (class53)this.field309.get(var3); // L: 36
		if (var5 != null) { // L: 37
			return var5; // L: 38
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field305, var1, var2); // L: 40
			if (var6 == null) { // L: 41
				return new class53(); // L: 42
			} else {
				class53 var7 = new class53(var6); // L: 44
				this.field309.put(var7, var3); // L: 45
				return var7; // L: 46
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lbr;",
		garbageValue = "-28"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 50
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 51
		} else {
			throw new RuntimeException(); // L: 52
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)Lcj;",
		garbageValue = "1769"
	)
	public class53 method834(int var1) {
		if (this.field305.getGroupCount() == 1) { // L: 56
			return this.method832(0, var1); // L: 57
		} else if (this.field305.getGroupFileCount(var1) == 1) { // L: 59
			return this.method832(var1, 0); // L: 60
		} else {
			throw new RuntimeException(); // L: 63
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbr;",
		garbageValue = "-42"
	)
	public RawSound method826(int var1) {
		return this.getSoundEffect(var1, (int[])null); // L: 68
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "123"
	)
	long method827(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12); // L: 72
		var4 |= var1 << 16; // L: 73
		return var3 ? (long)var4 ^ 4294967296L : (long)var4; // L: 74 75 78
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	static void method821() {
		if (ModeWhere.worldMap != null) { // L: 4563
			ModeWhere.worldMap.method8719(class172.Client_plane, GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7), DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7), false); // L: 4564
			ModeWhere.worldMap.loadCache(); // L: 4565
		}

	} // L: 4567

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "350310469"
	)
	static final void method836(PacketBuffer var0) {
		var0.importIndex(); // L: 8815
		int var1 = var0.readBits(8); // L: 8816
		int var2;
		if (var1 < Client.npcCount) { // L: 8817
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 8818
				Client.field643[++Client.field637 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 8820
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8821

			for (var2 = 0; var2 < var1; ++var2) { // L: 8822
				int var3 = Client.npcIndices[var2]; // L: 8823
				NPC var4 = Client.npcs[var3]; // L: 8824
				int var5 = var0.readBits(1); // L: 8825
				if (var5 == 0) { // L: 8826
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8827
					var4.npcCycle = Client.cycle; // L: 8828
				} else {
					int var6 = var0.readBits(2); // L: 8831
					if (var6 == 0) { // L: 8832
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8833
						var4.npcCycle = Client.cycle; // L: 8834
						Client.field742[++Client.field571 - 1] = var3; // L: 8835
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 8838
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8839
							var4.npcCycle = Client.cycle; // L: 8840
							var7 = var0.readBits(3); // L: 8841
							var4.method2585(var7, class233.field2486); // L: 8842
							var8 = var0.readBits(1); // L: 8843
							if (var8 == 1) { // L: 8844
								Client.field742[++Client.field571 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 8847
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8848
							var4.npcCycle = Client.cycle; // L: 8849
							if (var0.readBits(1) == 1) { // L: 8850
								var7 = var0.readBits(3); // L: 8851
								var4.method2585(var7, class233.field2485); // L: 8852
								var8 = var0.readBits(3); // L: 8853
								var4.method2585(var8, class233.field2485); // L: 8854
							} else {
								var7 = var0.readBits(3); // L: 8857
								var4.method2585(var7, class233.field2483); // L: 8858
							}

							var7 = var0.readBits(1); // L: 8860
							if (var7 == 1) { // L: 8861
								Client.field742[++Client.field571 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 8864
							Client.field643[++Client.field637 - 1] = var3; // L: 8865
						}
					}
				}
			}

		}
	} // L: 8869

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1001279696"
	)
	static void method843(NPC var0) {
		var0.field1249 = var0.definition.size; // L: 9201
		var0.field1268 = var0.definition.rotation; // L: 9202
		var0.walkSequence = var0.definition.walkSequence; // L: 9203
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 9204
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 9205
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 9206
		var0.idleSequence = var0.definition.idleSequence; // L: 9207
		var0.field1206 = var0.definition.turnLeftSequence; // L: 9208
		var0.field1207 = var0.definition.turnRightSequence; // L: 9209
		var0.runSequence = var0.definition.field2117; // L: 9210
		var0.field1213 = var0.definition.field2105; // L: 9211
		var0.field1214 = var0.definition.field2119; // L: 9212
		var0.field1215 = var0.definition.field2111; // L: 9213
		var0.field1264 = var0.definition.field2121; // L: 9214
		var0.field1269 = var0.definition.field2122; // L: 9215
		var0.field1218 = var0.definition.field2123; // L: 9216
		var0.field1226 = var0.definition.field2124; // L: 9217
	} // L: 9218
}
