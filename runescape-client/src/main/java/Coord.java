import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = 1885285715
	)
	static int field3432;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 656241637
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2064471179
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2141185315
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Llt;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2027408234"
	)
	@Export("packed")
	public int packed() {
		return class249.method5137(this.plane, this.x, this.y); // L: 30
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llt;I)Z",
		garbageValue = "2032380368"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 45
			return false;
		} else if (this.x != var1.x) { // L: 46
			return false;
		} else {
			return this.y == var1.y; // L: 47
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-11455619"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 39
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 40 41
		}
	}

	public int hashCode() {
		return this.packed();
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lhx;",
		garbageValue = "218692626"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 51
		if (var1 != null) { // L: 52
			return var1; // L: 53
		} else {
			byte[] var2 = HealthBar.SequenceDefinition_archive.takeFile(12, var0); // L: 55
			var1 = new SequenceDefinition(); // L: 56
			if (var2 != null) { // L: 57
				var1.decode(new Buffer(var2)); // L: 58
			}

			var1.postDecode(); // L: 60
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 61
			return var1; // L: 62
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-286114668"
	)
	static final void method5753(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 4944
			GrandExchangeOfferUnitPriceComparator.worldToScreen(Client.field506 * 64 + (Client.hintArrowX - GameEngine.baseX * 64 << 7), Client.field669 * 64 + (Client.hintArrowY - class178.baseY * 64 << 7), Client.field505 * 4); // L: 4945
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4946
				EnumComposition.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 4947

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIZS)V",
		garbageValue = "-321"
	)
	static final void method5773(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class124.field1471 || ArchiveDiskActionHandler.field4161 != var1) { // L: 5651
			class124.field1471 = var0; // L: 5654
			ArchiveDiskActionHandler.field4161 = var1; // L: 5655
			class19.method280(25); // L: 5656
			class16.drawLoadingMessage("Loading - please wait.", true); // L: 5657
			int var3 = GameEngine.baseX * 64; // L: 5658
			int var4 = class178.baseY * 64; // L: 5659
			GameEngine.baseX = (var0 - 6) * 8; // L: 5660
			class178.baseY = (var1 - 6) * 8; // L: 5661
			int var5 = GameEngine.baseX * 64 - var3; // L: 5662
			int var6 = class178.baseY * 64 - var4; // L: 5663
			var3 = GameEngine.baseX * 64; // L: 5664
			var4 = class178.baseY * 64; // L: 5665

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5666
				NPC var19 = Client.npcs[var7]; // L: 5667
				if (var19 != null) { // L: 5668
					for (var9 = 0; var9 < 10; ++var9) { // L: 5669
						var10000 = var19.pathX; // L: 5670
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5671
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5673
					var19.y -= var6 * 128; // L: 5674
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5677
				Player var22 = Client.players[var7]; // L: 5678
				if (var22 != null) { // L: 5679
					for (var9 = 0; var9 < 10; ++var9) { // L: 5680
						var10000 = var22.pathX; // L: 5681
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5682
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5684
					var22.y -= var6 * 128; // L: 5685
				}
			}

			byte var20 = 0; // L: 5688
			byte var8 = 104; // L: 5689
			byte var21 = 1; // L: 5690
			if (var5 < 0) { // L: 5691
				var20 = 103; // L: 5692
				var8 = -1; // L: 5693
				var21 = -1; // L: 5694
			}

			byte var10 = 0; // L: 5696
			byte var11 = 104; // L: 5697
			byte var12 = 1; // L: 5698
			if (var6 < 0) { // L: 5699
				var10 = 103; // L: 5700
				var11 = -1; // L: 5701
				var12 = -1; // L: 5702
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5704
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5705
					int var15 = var13 + var5; // L: 5706
					int var16 = var14 + var6; // L: 5707

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5708
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5709
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5710
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5714 5715 5719
				var18.x -= var5; // L: 5716
				var18.y -= var6; // L: 5717
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5718
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5721
				Client.destinationX -= var5; // L: 5722
				Client.destinationY -= var6; // L: 5723
			}

			Client.soundEffectCount = 0; // L: 5725
			Client.isCameraLocked = false; // L: 5726
			class381.cameraX -= var5 << 7; // L: 5727
			class471.cameraZ -= var6 << 7; // L: 5728
			GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX -= var5 << 7; // L: 5729
			ReflectionCheck.oculusOrbFocalPointY -= var6 << 7; // L: 5730
			Client.field720 = -1; // L: 5731
			Client.graphicsObjects.clear(); // L: 5732
			Client.projectiles.clear(); // L: 5733

			for (var14 = 0; var14 < 4; ++var14) { // L: 5734
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5652 5735

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1041793614"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10831
	}
}
