import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public class class277 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1100536913
	)
	static int field3054;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "654050748"
	)
	static final void method5591() {
		class1.method7(MusicPatchPcmStream.field3573, Interpreter.field879, ReflectionCheck.field244); // L: 4054
		class180.method3594(FriendsList.field4774, class344.field3667); // L: 4055
		if (WorldMapLabelSize.cameraX == MusicPatchPcmStream.field3573 && Interpreter.field879 == MouseHandler.cameraY && class193.cameraZ == ReflectionCheck.field244 && FriendsList.field4774 == UserComparator10.cameraPitch && class17.cameraYaw == class344.field3667) { // L: 4056
			Client.field626 = false; // L: 4057
			Client.isCameraLocked = false; // L: 4058
			Client.field603 = false; // L: 4059
			Client.field774 = false; // L: 4060
			Skeleton.field2633 = 0; // L: 4061
			class91.field1119 = 0; // L: 4062
			class9.field38 = 0; // L: 4063
			class440.field4745 = 0; // L: 4064
			CollisionMap.field2445 = 0; // L: 4065
			class20.field91 = 0; // L: 4066
			Renderable.field2716 = 0; // L: 4067
			class315.field3463 = 0; // L: 4068
			class150.field1714 = 0; // L: 4069
			Actor.field1276 = 0; // L: 4070
			Client.field776 = null; // L: 4071
			Client.field778 = null; // L: 4072
			Client.field777 = null; // L: 4073
		}

	} // L: 4075

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(IIIILvg;Lmu;I)V",
		garbageValue = "880361217"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12714
			int var6 = Client.camAngleY & 2047; // L: 12715
			int var7 = var3 * var3 + var2 * var2; // L: 12716
			if (var7 <= 6400) { // L: 12717
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12718
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12719
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12720
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12721
				if (var7 > 2500) {
					var4.method9820(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12722
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12723
				}

			}
		}
	} // L: 12724
}
