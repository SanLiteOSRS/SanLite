import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 561649739
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljh;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("dx")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[Ltz;",
		garbageValue = "121"
	)
	static PrivateChatMode[] method4682() {
		return new PrivateChatMode[]{PrivateChatMode.field5153, PrivateChatMode.field5155, PrivateChatMode.field5154}; // L: 11
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	static void method4678() {
		if (HitSplatDefinition.localPlayer.x >> 7 == Client.destinationX && HitSplatDefinition.localPlayer.y >> 7 == Client.destinationY) { // L: 4852
			Client.destinationX = 0; // L: 4853
		}

	} // L: 4855
}
