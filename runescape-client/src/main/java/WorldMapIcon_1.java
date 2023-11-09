import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1586935727
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -847793277
	)
	@Export("element")
	int element;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -934469311
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -323192051
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lkp;Lkp;ILhp;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	} // L: 21

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "567101989"
	)
	@Export("init")
	void init() {
		this.element = WorldMapDecoration.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(TileItem.WorldMapElement_get(this.element));
		WorldMapElement var1 = TileItem.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2045439656"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Liy;",
		garbageValue = "1"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2147415720"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "740963101"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldp;FB)F",
		garbageValue = "78"
	)
	static float method4561(class117 var0, float var1) {
		if (var0 == null) { // L: 116
			return 0.0F; // L: 117
		} else {
			float var2;
			if (var1 == var0.field1439) { // L: 120
				var2 = 0.0F; // L: 121
			} else if (var0.field1440 == var1) { // L: 123
				var2 = 1.0F; // L: 124
			} else {
				var2 = (var1 - var0.field1439) / (var0.field1440 - var0.field1439); // L: 127
			}

			float var3;
			if (var0.field1433) { // L: 130
				var3 = var2; // L: 131
			} else {
				float[] var4 = new float[]{var0.field1441[0] - var2, var0.field1441[1], var0.field1441[2], var0.field1441[3]}; // L: 134 135 136 137 138
				float[] var5 = new float[5]; // L: 139
				int var6 = class358.method6579(var4, 3, 0.0F, true, 1.0F, true, var5); // L: 140
				if (var6 == 1) { // L: 141
					var3 = var5[0]; // L: 142
				} else {
					var3 = 0.0F; // L: 145
				}
			}

			return var3 * (var0.field1442[1] + var3 * (var0.field1442[2] + var0.field1442[3] * var3)) + var0.field1442[0]; // L: 148
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1256478821"
	)
	public static int method4560(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	static final void method4559() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 5074 5075 5092
			if (var0.plane == FriendSystem.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 5076
				if (Client.cycle >= var0.cycleStart) { // L: 5077
					if (var0.targetIndex > 0) { // L: 5078
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 5079
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 5080
							var0.setDestination(var1.x, var1.y, SecureRandomFuture.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 5082
						int var2 = -var0.targetIndex - 1; // L: 5084
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 5085
							var3 = class28.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 5086
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, SecureRandomFuture.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 5087
						}
					}

					var0.advance(Client.field744); // L: 5089
					Decimator.scene.drawEntity(FriendSystem.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 5090
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5094
}
