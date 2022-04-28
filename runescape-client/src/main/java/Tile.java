import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 554063901
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1735268707
	)
	@Export("x")
	int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1320451453
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 409854947
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 888964959
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Liy;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("w")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1954145803
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1615665333
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("m")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("u")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("t")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1788944153
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1042074251
	)
	int field2544;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -147563717
	)
	int field2545;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1316845431
	)
	int field2546;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1950958863"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (PcmPlayer.garbageCollector == null || !PcmPlayer.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						PcmPlayer.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (PcmPlayer.garbageCollector != null) {
			long var9 = class136.method2931();
			long var3 = PcmPlayer.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "418213211"
	)
	static void method4603(int var0) {
		Client.oculusOrbState = var0;
	}
}
