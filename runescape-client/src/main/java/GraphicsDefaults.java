import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1395626587
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -489214437
	)
	public int field3915;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1090663559
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -722037607
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1949905153
	)
	public int field3908;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2078884559
	)
	public int field3909;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1596503367
	)
	public int field3910;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -898287369
	)
	public int field3914;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1050617327
	)
	public int field3904;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1817726075
	)
	public int field3913;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 854072411
	)
	public int field3916;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field3915 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field3908 = -1;
		this.field3909 = -1;
		this.field3910 = -1;
		this.field3914 = -1;
		this.field3904 = -1;
		this.field3913 = -1;
		this.field3916 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "301330792"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3903.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.compass = var3.method6464();
				this.field3915 = var3.method6464();
				this.mapScenes = var3.method6464();
				this.headIconsPk = var3.method6464();
				this.field3908 = var3.method6464();
				this.field3909 = var3.method6464();
				this.field3910 = var3.method6464();
				this.field3914 = var3.method6464();
				this.field3904 = var3.method6464();
				this.field3913 = var3.method6464();
				this.field3916 = var3.method6464();
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;I)I",
		garbageValue = "-1709043428"
	)
	static int method5825(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		if (var0.tryLoadFileByNames("title.jpg", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("logo", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("logo_deadman_mode", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("logo_seasonal_mode", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("titlebox", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("titlebutton", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("runes", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("title_mute", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,0", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,2", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,4", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,6", "")) {
			++var2;
		}

		var1.tryLoadFileByNames("sl_back", "");
		var1.tryLoadFileByNames("sl_flags", "");
		var1.tryLoadFileByNames("sl_arrows", "");
		var1.tryLoadFileByNames("sl_stars", "");
		var1.tryLoadFileByNames("sl_button", "");
		return var2;
	}
}
