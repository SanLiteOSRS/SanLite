import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1077063835
	)
	@Export("world")
	public int world;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -977987065
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -461792485
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "2"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1781991225"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)Z",
		garbageValue = "1704651337"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 627
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 628
			if (var0.readBits(1) != 0) { // L: 629
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 630
			var4 = var0.readBits(13); // L: 631
			boolean var12 = var0.readBits(1) == 1; // L: 632
			if (var12) { // L: 633
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 634
				throw new RuntimeException(); // L: 635
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 637
				var11.index = var1; // L: 638
				if (Players.field1357[var1] != null) { // L: 639
					var11.read(Players.field1357[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 640
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 641
				var7 = Players.Players_regions[var1]; // L: 642
				var8 = var7 >> 28; // L: 643
				var9 = var7 >> 14 & 255; // L: 644
				var10 = var7 & 255; // L: 645
				var11.pathTraversed[0] = Players.field1356[var1]; // L: 646
				var11.plane = (byte)var8; // L: 647
				var11.resetPath((var9 << 13) + var3 - class187.baseX * 64, (var10 << 13) + var4 - class101.baseY * 64); // L: 648
				var11.field1122 = false; // L: 649
				return true; // L: 650
			}
		} else if (var2 == 1) { // L: 652
			var3 = var0.readBits(2); // L: 653
			var4 = Players.Players_regions[var1]; // L: 654
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 655
			return false; // L: 656
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 658
				var3 = var0.readBits(5); // L: 659
				var4 = var3 >> 3; // L: 660
				var5 = var3 & 7; // L: 661
				var6 = Players.Players_regions[var1]; // L: 662
				var7 = (var6 >> 28) + var4 & 3; // L: 663
				var8 = var6 >> 14 & 255; // L: 664
				var9 = var6 & 255; // L: 665
				if (var5 == 0) { // L: 666
					--var8; // L: 667
					--var9; // L: 668
				}

				if (var5 == 1) { // L: 670
					--var9;
				}

				if (var5 == 2) { // L: 671
					++var8; // L: 672
					--var9; // L: 673
				}

				if (var5 == 3) { // L: 675
					--var8;
				}

				if (var5 == 4) { // L: 676
					++var8;
				}

				if (var5 == 5) { // L: 677
					--var8; // L: 678
					++var9; // L: 679
				}

				if (var5 == 6) { // L: 681
					++var9;
				}

				if (var5 == 7) { // L: 682
					++var8; // L: 683
					++var9; // L: 684
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 686
				return false; // L: 687
			} else {
				var3 = var0.readBits(18); // L: 689
				var4 = var3 >> 16; // L: 690
				var5 = var3 >> 8 & 255; // L: 691
				var6 = var3 & 255; // L: 692
				var7 = Players.Players_regions[var1]; // L: 693
				var8 = (var7 >> 28) + var4 & 3; // L: 694
				var9 = var5 + (var7 >> 14) & 255; // L: 695
				var10 = var6 + var7 & 255; // L: 696
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 697
				return false; // L: 698
			}
		}
	}
}
