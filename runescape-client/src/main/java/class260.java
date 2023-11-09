import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
public class class260 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1980903392"
	)
	public static boolean method5128() {
		return class273.musicPlayerStatus != 0 ? true : ItemContainer.midiPcmStream.isReady(); // L: 56 57
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-83"
	)
	static final void method5127(int var0, int var1, int var2) {
		if (class16.cameraX < var0) { // L: 3727
			class16.cameraX = (var0 - class16.cameraX) * WorldMapData_1.field2759 / 1000 + class16.cameraX + class271.field3186; // L: 3728
			if (class16.cameraX > var0) { // L: 3729
				class16.cameraX = var0;
			}
		}

		if (class16.cameraX > var0) { // L: 3731
			class16.cameraX -= (class16.cameraX - var0) * WorldMapData_1.field2759 / 1000 + class271.field3186; // L: 3732
			if (class16.cameraX < var0) { // L: 3733
				class16.cameraX = var0;
			}
		}

		if (WorldMapLabel.cameraY < var1) { // L: 3735
			WorldMapLabel.cameraY = (var1 - WorldMapLabel.cameraY) * WorldMapData_1.field2759 / 1000 + WorldMapLabel.cameraY + class271.field3186; // L: 3736
			if (WorldMapLabel.cameraY > var1) { // L: 3737
				WorldMapLabel.cameraY = var1;
			}
		}

		if (WorldMapLabel.cameraY > var1) { // L: 3739
			WorldMapLabel.cameraY -= (WorldMapLabel.cameraY - var1) * WorldMapData_1.field2759 / 1000 + class271.field3186; // L: 3740
			if (WorldMapLabel.cameraY < var1) { // L: 3741
				WorldMapLabel.cameraY = var1;
			}
		}

		if (class269.cameraZ < var2) { // L: 3743
			class269.cameraZ = (var2 - class269.cameraZ) * WorldMapData_1.field2759 / 1000 + class269.cameraZ + class271.field3186; // L: 3744
			if (class269.cameraZ > var2) { // L: 3745
				class269.cameraZ = var2;
			}
		}

		if (class269.cameraZ > var2) { // L: 3747
			class269.cameraZ -= (class269.cameraZ - var2) * WorldMapData_1.field2759 / 1000 + class271.field3186; // L: 3748
			if (class269.cameraZ < var2) { // L: 3749
				class269.cameraZ = var2;
			}
		}

	} // L: 3751

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Lkn;",
		garbageValue = "-1790407021"
	)
	static Widget method5126(Widget var0) {
		Widget var2 = var0; // L: 11502
		int var3 = class134.method2860(class193.getWidgetFlags(var0)); // L: 11504
		Widget var1;
		if (var3 == 0) { // L: 11505
			var1 = null; // L: 11506
		} else {
			int var4 = 0;

			while (true) {
				if (var4 >= var3) {
					var1 = var2; // L: 11516
					break;
				}

				var2 = HitSplatDefinition.getWidget(var2.parentId); // L: 11510
				if (var2 == null) { // L: 11511
					var1 = null; // L: 11512
					break; // L: 11513
				}

				++var4; // L: 11509
			}
		}

		Widget var5 = var1; // L: 11518
		if (var1 == null) { // L: 11519
			var5 = var0.parent;
		}

		return var5; // L: 11520
	}
}
