import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("l")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		signature = "(Liw;Liw;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([Lko;I)Ljava/util/HashMap;",
		garbageValue = "1654438568"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				Font var6 = SceneTilePaint.method3210(this.spritesArchive, this.fontsArchive, var5.name, "");
				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		signature = "(IIIZI)V",
		garbageValue = "-1606902213"
	)
	static final void method5463(int var0, int var1, int var2, boolean var3) {
		if (ScriptFrame.loadInterface(var0)) {
			SecureRandomFuture.resizeInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
