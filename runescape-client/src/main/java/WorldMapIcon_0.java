import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		signature = "Liz;"
	)
	public static class248 field148;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2114229287
	)
	static int field146;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "Llu;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("az")
	@Export("client")
	@ObfuscatedSignature(
		signature = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("gk")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 660088057
	)
	@Export("element")
	final int element;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lah;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1542772613
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 112630785
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhs;Lhs;ILah;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = UserComparator10.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-359753179"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(I)Lah;",
		garbageValue = "1889474780"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-79"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1082591682"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(II)Ljd;",
		garbageValue = "-1562808952"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(IZII)V",
		garbageValue = "1525295907"
	)
	public static final void method270(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			PcmPlayer.field1443 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			PcmPlayer.field1424 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
