import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class204 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Llo;"
	)
	static IndexedSprite field2408;

	static {
		new HashMap();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(ILhs;ZB)V",
		garbageValue = "78"
	)
	static void method3721(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = Actor.getWorldMap().getMapArea(var0);
		int var4 = PlayerComposition.localPlayer.plane;
		int var5 = NetFileRequest.baseX * 64 + (PlayerComposition.localPlayer.x >> 7);
		int var6 = class41.baseY * 64 + (PlayerComposition.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		Actor.getWorldMap().method6485(var3, var7, var1, var2);
	}
}
