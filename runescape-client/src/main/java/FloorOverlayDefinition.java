import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1028523769
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1691102667
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ay")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1606737297
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -969114955
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1770595317
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1694568151
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1990408719
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2053673405
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 847200605
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1032657340"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) { // L: 39
			this.setHsl(this.secondaryRgb); // L: 40
			this.secondaryHue = this.hue; // L: 41
			this.secondarySaturation = this.saturation; // L: 42
			this.secondaryLightness = this.lightness; // L: 43
		}

		this.setHsl(this.primaryRgb); // L: 45
	} // L: 46

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)V",
		garbageValue = "-124"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 50
			if (var3 == 0) { // L: 51
				return; // L: 54
			}

			this.decodeNext(var1, var3, var2); // L: 52
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltl;III)V",
		garbageValue = "1541653099"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 57
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 58
		} else if (var2 == 5) { // L: 59
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 60
		} else if (var2 == 8) { // L: 61
		}

	} // L: 63

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1788421921"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 66
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 67
		double var6 = (double)(var1 & 255) / 256.0D; // L: 68
		double var8 = var2; // L: 69
		if (var4 < var2) { // L: 70
			var8 = var4;
		}

		if (var6 < var8) { // L: 71
			var8 = var6;
		}

		double var10 = var2; // L: 72
		if (var4 > var2) { // L: 73
			var10 = var4;
		}

		if (var6 > var10) { // L: 74
			var10 = var6;
		}

		double var12 = 0.0D; // L: 75
		double var14 = 0.0D; // L: 76
		double var16 = (var8 + var10) / 2.0D; // L: 77
		if (var8 != var10) { // L: 78
			if (var16 < 0.5D) { // L: 79
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 80
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 81
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 82
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 83
			}
		}

		var12 /= 6.0D; // L: 85
		this.hue = (int)(256.0D * var12); // L: 86
		this.saturation = (int)(256.0D * var14); // L: 87
		this.lightness = (int)(var16 * 256.0D); // L: 88
		if (this.saturation < 0) { // L: 89
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 90
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 91
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 92
			this.lightness = 255;
		}

	} // L: 93

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1616484144"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ServerPacket.getWidgetChild(var0, var1); // L: 10000
		if (var4 != null && var4.onTargetEnter != null) { // L: 10001
			ScriptEvent var5 = new ScriptEvent(); // L: 10002
			var5.widget = var4; // L: 10003
			var5.args = var4.onTargetEnter; // L: 10004
			class170.runScriptEvent(var5); // L: 10005
		}

		Client.selectedSpellItemId = var3; // L: 10007
		Client.isSpellSelected = true; // L: 10008
		Canvas.selectedSpellWidget = var0; // L: 10009
		Client.selectedSpellChildIndex = var1; // L: 10010
		class13.selectedSpellFlags = var2; // L: 10011
		class303.invalidateWidget(var4); // L: 10012
	} // L: 10013
}
