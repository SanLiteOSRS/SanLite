import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 147903781
	)
	@Export("element")
	final int element;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -648601801
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -680760437
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmk;Lmk;ILkc;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class127.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1344079947"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lkc;",
		garbageValue = "-248484486"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1481600529"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-110345311"
	)
	static final void method5479(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12183
		if (var0 != ScriptFrame.clientPreferences.method2516()) { // L: 12184
			label26: {
				if (ScriptFrame.clientPreferences.method2516() == 0) { // L: 12186
					boolean var1 = !class305.field3398.isEmpty(); // L: 12189
					if (var1) { // L: 12191
						class147.method3233(class329.archive11, var0); // L: 12192
						Client.playingJingle = false; // L: 12193
						break label26;
					}
				}

				if (var0 == 0) { // L: 12197
					class90.method2339(0, 0); // L: 12198
					Client.playingJingle = false; // L: 12199
				} else {
					Calendar.method6618(var0); // L: 12201
				}
			}

			ScriptFrame.clientPreferences.method2593(var0); // L: 12203
		}

	} // L: 12205
}
