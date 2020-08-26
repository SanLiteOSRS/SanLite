import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("ay")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 1560558325
	)
	static int field154;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -68382233
	)
	@Export("element")
	final int element;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Laq;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1820517903
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 877531577
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhg;Lhg;ILaq;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = WorldMapSection0.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1613828162"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)Laq;",
		garbageValue = "499378708"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "182515130"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-2001682063"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		signature = "(Lhq;B)I",
		garbageValue = "-82"
	)
	@Export("getWidgetClickMask")
	static int getWidgetClickMask(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetClickMasks.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.clickMask;
	}
}
