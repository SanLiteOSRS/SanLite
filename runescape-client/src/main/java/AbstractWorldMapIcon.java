import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1724895915
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 945338029
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Llt;Llt;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-81"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljb;",
		garbageValue = "-166366580"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "638535000"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "36"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "941876103"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "3146"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "534224947"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class123.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) { // L: 54
					return false;
				}
				break;
			case 1:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 44
					return false;
				}
				break;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 66
					return false;
				}
				break;
			case 1:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 61
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "22"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lrm;I)Ljava/lang/String;",
		garbageValue = "-1753469141"
	)
	public static String method5295(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 48
			return null;
		} else {
			int var2 = 0; // L: 49

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) { // L: 50 53 63
				var5 = var0.charAt(var2); // L: 55
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 57
				if (!var4) { // L: 59
					break;
				}
			}

			while (var3 > var2) { // L: 67
				var5 = var0.charAt(var3 - 1); // L: 69
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 71
				if (!var4) { // L: 73
					break;
				}

				--var3; // L: 77
			}

			int var10 = var3 - var2; // L: 79
			if (var10 >= 1 && var10 <= PlayerType.method6363(var1)) { // L: 80
				StringBuilder var9 = new StringBuilder(var10); // L: 81

				for (int var6 = var2; var6 < var3; ++var6) { // L: 82
					char var7 = var0.charAt(var6); // L: 83
					if (VarbitComposition.method3770(var7)) { // L: 84
						char var8 = JagexCache.method3483(var7); // L: 85
						if (var8 != 0) { // L: 86
							var9.append(var8); // L: 87
						}
					}
				}

				if (var9.length() == 0) { // L: 89
					return null;
				} else {
					return var9.toString(); // L: 90
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lbj;B)V",
		garbageValue = "26"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 266
		if (var0.sound != null) { // L: 267
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 268
		}

	} // L: 269

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1903521341"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4839
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4840
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4841
				int var3 = var2.x >> 7; // L: 4842
				int var4 = var2.y >> 7; // L: 4843
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4844
					if (var2.field1142 * -420973504 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4845
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4846
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4847
					}

					long var5 = class103.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4849
					var2.playerCycle = Client.cycle; // L: 4850
					class1.scene.drawEntity(TaskHandler.Client_plane, var2.x, var2.y, WorldMapDecorationType.getTileHeight(var2.field1142 * -1172500480 - 64 + var2.x, var2.field1142 * -1172500480 - 64 + var2.y, TaskHandler.Client_plane), var2.field1142 * -1172500480 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4851
				}
			}
		}

	} // L: 4855
}
