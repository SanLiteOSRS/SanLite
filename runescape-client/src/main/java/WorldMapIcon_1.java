import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1272071383
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lax;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1816725297
	)
	@Export("element")
	int element;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lai;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -29406003
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1922717703
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhw;Lhw;ILax;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "24"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)Lai;",
		garbageValue = "-669051823"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1627026836"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "190840278"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1939133514"
	)
	@Export("init")
	void init() {
		this.element = ScriptEvent.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class194.WorldMapElement_get(this.element));
		WorldMapElement var1 = class194.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lcf;Lcf;IZIZI)I",
		garbageValue = "586968313"
	)
	static int method395(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = WorldMapSprite.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = WorldMapSprite.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-218709876"
	)
	public static void method398() {
		PlayerComposition.PlayerAppearance_cachedModels.clear();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lht;IIII)V",
		garbageValue = "-630082836"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2670 == null) {
			throw new RuntimeException();
		} else {
			var0.field2670[var1] = var2;
			var0.field2671[var1] = var3;
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1198701264"
	)
	static final void method392() {
		int var0 = WorldMapSection2.field225 * 16384 + 64;
		int var1 = WorldMapLabelSize.field152 * 128 + 64;
		int var2 = GrandExchangeOfferWorldComparator.getTileHeight(var0, var1, GrandExchangeOfferUnitPriceComparator.Client_plane) - SpriteMask.field2542;
		if (ItemContainer.cameraX < var0) {
			ItemContainer.cameraX = (var0 - ItemContainer.cameraX) * ReflectionCheck.field1364 / 1000 + ItemContainer.cameraX + Player.field674;
			if (ItemContainer.cameraX > var0) {
				ItemContainer.cameraX = var0;
			}
		}

		if (ItemContainer.cameraX > var0) {
			ItemContainer.cameraX -= ReflectionCheck.field1364 * (ItemContainer.cameraX - var0) / 1000 + Player.field674;
			if (ItemContainer.cameraX < var0) {
				ItemContainer.cameraX = var0;
			}
		}

		if (ChatChannel.cameraY < var2) {
			ChatChannel.cameraY = (var2 - ChatChannel.cameraY) * ReflectionCheck.field1364 / 1000 + ChatChannel.cameraY + Player.field674;
			if (ChatChannel.cameraY > var2) {
				ChatChannel.cameraY = var2;
			}
		}

		if (ChatChannel.cameraY > var2) {
			ChatChannel.cameraY -= ReflectionCheck.field1364 * (ChatChannel.cameraY - var2) / 1000 + Player.field674;
			if (ChatChannel.cameraY < var2) {
				ChatChannel.cameraY = var2;
			}
		}

		if (WorldMapManager.cameraZ < var1) {
			WorldMapManager.cameraZ = (var1 - WorldMapManager.cameraZ) * ReflectionCheck.field1364 / 1000 + WorldMapManager.cameraZ + Player.field674;
			if (WorldMapManager.cameraZ > var1) {
				WorldMapManager.cameraZ = var1;
			}
		}

		if (WorldMapManager.cameraZ > var1) {
			WorldMapManager.cameraZ -= ReflectionCheck.field1364 * (WorldMapManager.cameraZ - var1) / 1000 + Player.field674;
			if (WorldMapManager.cameraZ < var1) {
				WorldMapManager.cameraZ = var1;
			}
		}

		var0 = MilliClock.field2048 * 16384 + 64;
		var1 = PcmPlayer.field1449 * 16384 + 64;
		var2 = GrandExchangeOfferWorldComparator.getTileHeight(var0, var1, GrandExchangeOfferUnitPriceComparator.Client_plane) - AbstractRasterProvider.field3890;
		int var3 = var0 - ItemContainer.cameraX;
		int var4 = var2 - ChatChannel.cameraY;
		int var5 = var1 - WorldMapManager.cameraZ;
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047;
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047;
		if (var7 < 128) {
			var7 = 128;
		}

		if (var7 > 383) {
			var7 = 383;
		}

		if (World.cameraPitch < var7) {
			World.cameraPitch = (var7 - World.cameraPitch) * class60.field452 / 1000 + World.cameraPitch + WorldMapCacheName.field326;
			if (World.cameraPitch > var7) {
				World.cameraPitch = var7;
			}
		}

		if (World.cameraPitch > var7) {
			World.cameraPitch -= class60.field452 * (World.cameraPitch - var7) / 1000 + WorldMapCacheName.field326;
			if (World.cameraPitch < var7) {
				World.cameraPitch = var7;
			}
		}

		int var9 = var8 - ViewportMouse.cameraYaw;
		if (var9 > 1024) {
			var9 -= 2048;
		}

		if (var9 < -1024) {
			var9 += 2048;
		}

		if (var9 > 0) {
			ViewportMouse.cameraYaw = var9 * class60.field452 / 1000 + ViewportMouse.cameraYaw + WorldMapCacheName.field326;
			ViewportMouse.cameraYaw &= 2047;
		}

		if (var9 < 0) {
			ViewportMouse.cameraYaw -= -var9 * class60.field452 / 1000 + WorldMapCacheName.field326;
			ViewportMouse.cameraYaw &= 2047;
		}

		int var10 = var8 - ViewportMouse.cameraYaw;
		if (var10 > 1024) {
			var10 -= 2048;
		}

		if (var10 < -1024) {
			var10 += 2048;
		}

		if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
			ViewportMouse.cameraYaw = var8;
		}

	}
}
