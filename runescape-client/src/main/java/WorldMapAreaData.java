import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("i")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("o")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("n")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lqy;Lqy;IZI)V",
		garbageValue = "-2083183142"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lqy;ZB)V",
		garbageValue = "31"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method8568(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lcj;ZB)V",
		garbageValue = "8"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4850
			var0.isUnanimated = false; // L: 4851
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 4852 4853
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4855
			int var3 = var0.y >> 7; // L: 4856
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4857
				long var4 = GameEngine.calculateTag(0, 0, 0, false, var0.index); // L: 4858
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4859
					var0.isUnanimated = false; // L: 4860
					var0.tileHeight = SpotAnimationDefinition.getTileHeight(var0.x, var0.y, class383.Client_plane); // L: 4861
					var0.playerCycle = Client.cycle; // L: 4862
					ReflectionCheck.scene.addNullableObject(class383.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4863
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4866
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4867
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4868
					}

					var0.tileHeight = SpotAnimationDefinition.getTileHeight(var0.x, var0.y, class383.Client_plane); // L: 4870
					var0.playerCycle = Client.cycle; // L: 4871
					ReflectionCheck.scene.drawEntity(class383.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4872
				}
			}
		}

	} // L: 4876
}
