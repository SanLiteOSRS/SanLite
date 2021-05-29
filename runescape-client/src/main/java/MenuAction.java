import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1908566839
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 213019407
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -187586953
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 651752445
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("p")
	@Export("action")
	String action;

	MenuAction() {
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIILoh;Lit;I)V",
		garbageValue = "836097385"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var3 * var8 + var9 * var2 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			Interpreter.redHintArrowSprite.method6990(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			ObjectComposition.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
