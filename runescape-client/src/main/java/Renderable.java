import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		signature = "[Llc;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 685420897
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1647777713
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("cg")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lbd;I)V",
		garbageValue = "-1146861517"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class58.runScript(var0, 500000);
	}
}
