import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("t")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-605392872"
	)
	public static int method6162(CharSequence var0) {
		return class18.method255(var0, 10, true);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2091708586"
	)
	static final int method6160(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = ScriptFrame.method1160(var3, var5);
		int var8 = ScriptFrame.method1160(var3 + 1, var5);
		int var9 = ScriptFrame.method1160(var3, var5 + 1);
		int var10 = ScriptFrame.method1160(var3 + 1, var5 + 1);
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16);
		return var15;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "321225908"
	)
	static void method6159() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	static void method6157() {
		Login.loginIndex = 24;
		class44.setLoginResponseString("", "You were disconnected from the server.", "");
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field866) {
			class232.midiPcmStream.clear();
			class232.musicPlayerStatus = 1;
			JagexCache.musicTrackArchive = null;
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class12.clientPreferences.musicVolume != 0 && !Client.field866) {
			class229.playMusicTrack(2, class29.archive6, var0, 0, class12.clientPreferences.musicVolume, false);
		}

		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "91"
	)
	static final int method6161() {
		if (class12.clientPreferences.roofsHidden) {
			return ParamComposition.Client_plane;
		} else {
			int var0 = SceneTilePaint.getTileHeight(class20.cameraX, WorldMapDecoration.cameraZ, ParamComposition.Client_plane);
			return var0 - Skeleton.cameraY < 800 && (Tiles.Tiles_renderFlags[ParamComposition.Client_plane][class20.cameraX >> 7][WorldMapDecoration.cameraZ >> 7] & 4) != 0 ? ParamComposition.Client_plane : 3;
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lcg;IIII)V",
		garbageValue = "-587367035"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class35.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = class35.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = HorizontalAlignment.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = HorizontalAlignment.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = HorizontalAlignment.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = HorizontalAlignment.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = HorizontalAlignment.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = HorizontalAlignment.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = HorizontalAlignment.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = HorizontalAlignment.colorStartTag(12648192);
					} else {
						var6 = HorizontalAlignment.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 8) == 8) {
						InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class35.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (class35.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class35.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (var0.method2137()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							InterfaceParent.insertMenuItemNoShift(Client.playerMenuActions[var10], HorizontalAlignment.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = HorizontalAlignment.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
