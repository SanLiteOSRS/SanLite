import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static AbstractArchive field985;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 618580957
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -373027479
	)
	@Export("type")
	int type;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1904322241
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1674675955
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1815829493
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1893774471
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1017637335
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -287053661
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLiv;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = ItemContainer.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2314 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (var10.sequenceDefinition == this.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4135()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "-112"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method4135(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label82: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label82;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class144.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) { // L: 81
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "1855948571"
	)
	public static long method2151(int var0) {
		if (var0 > 63) { // L: 98
			throw new class374("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0}); // L: 99
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L; // L: 101
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-115"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 125
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2085867489"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3651
			class20.clientPreferences.method2448(!class20.clientPreferences.method2513()); // L: 3652
			if (class20.clientPreferences.method2513()) { // L: 3653
				UserComparator5.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3654
			} else {
				UserComparator5.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3657
			}
		}

		if (var0.startsWith("zbuf")) { // L: 3660
			boolean var1 = PacketBufferNode.method5709(var0.substring(5).trim()) == 1; // L: 3661
			ScriptFrame.client.method531(var1); // L: 3662
			class314.method6147(var1); // L: 3663
		}

		if (var0.equalsIgnoreCase("z")) { // L: 3665
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3666
			class20.clientPreferences.method2443();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3667
			Client.field614 = !Client.field614;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3668
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3669
			if (var0.equalsIgnoreCase("errortest")) { // L: 3670
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3671
				class126.worldMap.showCoord = !class126.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3672
				class20.clientPreferences.method2483(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3673
				class20.clientPreferences.method2483(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3674
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3675
				class349.method6839();
			}
		}

		PacketBufferNode var2 = class330.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher); // L: 3678
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 3679
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3680
		Client.packetWriter.addNode(var2); // L: 3681
	} // L: 3682

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-16046"
	)
	static final int method2142() {
		return Client.menuOptionsCount - 1; // L: 9666
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ldv;IIII)V",
		garbageValue = "1402248095"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (MusicPatchNode.localPlayer != var0) { // L: 9904
			if (Client.menuOptionsCount < 400) { // L: 9905
				String var4;
				if (var0.skillLevel == 0) { // L: 9907
					var4 = var0.actions[0] + var0.username + var0.actions[1] + ItemContainer.method2243(var0.combatLevel, MusicPatchNode.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9908
				}

				int var5;
				if (Client.isItemSelected == 1) { // L: 9909
					MenuAction.insertMenuItemNoShift("Use", Client.field496 + " " + "->" + " " + class383.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9910
				} else if (Client.isSpellSelected) { // L: 9913
					if ((SecureRandomFuture.selectedSpellFlags & 8) == 8) { // L: 9914
						MenuAction.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class383.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9915
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) { // L: 9920
						if (Client.playerMenuActions[var5] != null) { // L: 9921
							short var6 = 0; // L: 9922
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) { // L: 9923
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 9924
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > MusicPatchNode.localPlayer.combatLevel) { // L: 9925
									var6 = 2000; // L: 9926
								}

								if (MusicPatchNode.localPlayer.team != 0 && var0.team != 0) { // L: 9928
									if (var0.team == MusicPatchNode.localPlayer.team) { // L: 9929
										var6 = 2000;
									} else {
										var6 = 0; // L: 9930
									}
								} else if (Client.playerAttackOption == AttackOption.field1307 && var0.isClanMember()) { // L: 9932
									var6 = 2000; // L: 9933
								}
							} else if (Client.playerOptionsPriorities[var5]) { // L: 9936
								var6 = 2000;
							}

							boolean var7 = false; // L: 9937
							int var8 = Client.playerMenuOpcodes[var5] + var6; // L: 9938
							MenuAction.insertMenuItemNoShift(Client.playerMenuActions[var5], class383.colorStartTag(16777215) + var4, var8, var1, var2, var3); // L: 9939
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 9944
					if (Client.menuOpcodes[var5] == 23) { // L: 9945
						Client.menuTargets[var5] = class383.colorStartTag(16777215) + var4; // L: 9946
						break;
					}
				}

			}
		}
	} // L: 9950

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lmq;IIII)V",
		garbageValue = "759225225"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11948
		if (var4 != null) { // L: 11949
			if (Client.minimapState < 3) { // L: 11950
				ChatChannel.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11951
			}

		}
	} // L: 11952
}
