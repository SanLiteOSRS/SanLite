import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class27 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("aa")
	int[] field127;
	@ObfuscatedName("az")
	int[] field128;

	public class27() {
		this.field127 = new int[112]; // L: 12
		this.field128 = new int[192]; // L: 13
		Arrays.fill(this.field127, 3); // L: 16
		Arrays.fill(this.field128, 3); // L: 17
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-77"
	)
	public void method359(int var1, int var2) {
		if (this.method386(var1) && this.method369(var2)) { // L: 21
			this.field127[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "1201352236"
	)
	public void method360(char var1, int var2) {
		if (this.method377(var1) && this.method369(var2)) { // L: 27
			this.field128[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1745274365"
	)
	public int method361(int var1) {
		return this.method386(var1) ? this.field127[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "155074636"
	)
	public int method362(char var1) {
		return this.method377(var1) ? this.field128[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1589962869"
	)
	public boolean method363(int var1) {
		return this.method386(var1) && (this.field127[var1] == 1 || this.field127[var1] == 3); // L: 47
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-674999067"
	)
	public boolean method358(char var1) {
		return this.method377(var1) && (this.field128[var1] == 1 || this.field128[var1] == 3); // L: 51
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-729885849"
	)
	public boolean method387(int var1) {
		return this.method386(var1) && (this.field127[var1] == 2 || this.field127[var1] == 3); // L: 55
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1669763559"
	)
	public boolean method380(char var1) {
		return this.method377(var1) && (this.field128[var1] == 2 || this.field128[var1] == 3); // L: 59
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2047713770"
	)
	boolean method386(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2055456568"
	)
	boolean method377(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-51"
	)
	boolean method369(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIB)V",
		garbageValue = "-59"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 12045
			if (var0 != null) { // L: 12047
				Widget var5 = var0; // L: 12051
				int var7 = class429.getWidgetFlags(var0); // L: 12054
				int var6 = var7 >> 17 & 7; // L: 12056
				int var8 = var6; // L: 12058
				Widget var4;
				int var9;
				if (var6 == 0) { // L: 12059
					var4 = null; // L: 12060
				} else {
					var9 = 0;

					while (true) {
						if (var9 >= var8) {
							var4 = var5; // L: 12070
							break;
						}

						var5 = ArchiveLoader.field1070.method6431(var5.parentId); // L: 12064
						if (var5 == null) { // L: 12065
							var4 = null; // L: 12066
							break; // L: 12067
						}

						++var9; // L: 12063
					}
				}

				Widget var10 = var4; // L: 12072
				if (var4 == null) { // L: 12073
					var10 = var0.parent;
				}

				if (var10 != null) { // L: 12076
					Client.clickedWidget = var0; // L: 12080
					var5 = var0; // L: 12084
					var7 = class429.getWidgetFlags(var0); // L: 12087
					var6 = var7 >> 17 & 7; // L: 12089
					var8 = var6; // L: 12091
					if (var6 == 0) { // L: 12092
						var4 = null; // L: 12093
					} else {
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								var4 = var5; // L: 12103
								break;
							}

							var5 = ArchiveLoader.field1070.method6431(var5.parentId); // L: 12097
							if (var5 == null) { // L: 12098
								var4 = null; // L: 12099
								break; // L: 12100
							}

							++var9; // L: 12096
						}
					}

					var10 = var4; // L: 12105
					if (var4 == null) { // L: 12106
						var10 = var0.parent;
					}

					Client.clickedWidgetParent = var10; // L: 12109
					Client.widgetClickX = var1; // L: 12110
					Client.widgetClickY = var2; // L: 12111
					WorldMapLabelSize.widgetDragDuration = 0; // L: 12112
					Client.isDraggingWidget = false; // L: 12113
					int var11 = FontName.method9113(); // L: 12114
					if (var11 != -1) { // L: 12115
						class363.tempMenuAction = new MenuAction(); // L: 12116
						class363.tempMenuAction.param0 = Client.menuArguments1[var11]; // L: 12117
						class363.tempMenuAction.param1 = Client.menuArguments2[var11]; // L: 12118
						class363.tempMenuAction.opcode = Client.menuOpcodes[var11]; // L: 12119
						class363.tempMenuAction.identifier = Client.menuIdentifiers[var11]; // L: 12120
						class363.tempMenuAction.field928 = Client.field680[var11]; // L: 12121
						class363.tempMenuAction.field931 = Client.menuActions[var11]; // L: 12122
						class363.tempMenuAction.field930 = Client.menuTargets[var11]; // L: 12123
					}

					return; // L: 12125
				}
			}

		}
	} // L: 12078
}
