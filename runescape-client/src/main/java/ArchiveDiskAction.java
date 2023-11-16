import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("or")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2085717441
	)
	@Export("type")
	int type;
	@ObfuscatedName("ah")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "20"
	)
	static int method6884(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3845
			var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3846
			var10 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3847
			Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3848
			return 1; // L: 3849
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3851
				class127.Interpreter_stringStackSize -= 2; // L: 3852
				var3 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize]; // L: 3853
				var4 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1]; // L: 3854
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3855
				return 1; // L: 3856
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3858
				var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3859
				var10 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3860
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3 + SceneTilePaint.intToString(var10, true); // L: 3861
				return 1; // L: 3862
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3864
				var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3865
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3866
				return 1; // L: 3867
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3869
					var11 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3870
					long var14 = (11745L + (long)var11) * 86400000L; // L: 3871
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3872
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3873
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3874
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3875
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3876
					return 1; // L: 3877
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3879
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3891
						var11 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3892
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3893
						return 1; // L: 3894
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3896
						class127.Interpreter_stringStackSize -= 2; // L: 3897
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.method7112(class189.compareStrings(Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1], class85.clientLanguage)); // L: 3898
						return 1; // L: 3899
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3901
							var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3902
							class517.Interpreter_intStackSize -= 2; // L: 3903
							var10 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3904
							var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3905
							var12 = VarbitComposition.archive13.takeFile(var9, 0); // L: 3906
							var13 = new Font(var12); // L: 3907
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3908
							return 1; // L: 3909
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3911
							var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3912
							class517.Interpreter_intStackSize -= 2; // L: 3913
							var10 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3914
							var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3915
							var12 = VarbitComposition.archive13.takeFile(var9, 0); // L: 3916
							var13 = new Font(var12); // L: 3917
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3918
							return 1; // L: 3919
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3921
							class127.Interpreter_stringStackSize -= 2; // L: 3922
							var3 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize]; // L: 3923
							var4 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1]; // L: 3924
							if (Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1) { // L: 3925
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4; // L: 3926
							}

							return 1; // L: 3927
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3929
							var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3930
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3931
							return 1; // L: 3932
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3934
							var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3935
							var10 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3936
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3937
							return 1; // L: 3938
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3940
							var11 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3941
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapElement.isCharPrintable((char)var11) ? 1 : 0; // L: 3942
							return 1; // L: 3943
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3945
							var11 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3946
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class25.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3947
							return 1; // L: 3948
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3950
							var11 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3951
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class10.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3952
							return 1; // L: 3953
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3955
							var11 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3956
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Player.isDigit((char)var11) ? 1 : 0; // L: 3957
							return 1; // L: 3958
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3960
							var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3961
							if (var3 != null) { // L: 3962
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3963
							}

							return 1; // L: 3964
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3966
							var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3967
							class517.Interpreter_intStackSize -= 2; // L: 3968
							var10 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3969
							var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3970
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3971
							return 1; // L: 3972
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3974
							var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3975
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3976
							boolean var18 = false; // L: 3977

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3978
								char var7 = var3.charAt(var6); // L: 3979
								if (var7 == '<') { // L: 3980
									var18 = true;
								} else if (var7 == '>') { // L: 3981
									var18 = false;
								} else if (!var18) { // L: 3982
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3984
							return 1; // L: 3985
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3987
							var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3988
							var10 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3989
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3990
							return 1; // L: 3991
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3993
							class127.Interpreter_stringStackSize -= 2; // L: 3994
							var3 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize]; // L: 3995
							var4 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1]; // L: 3996
							var9 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3997
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3998
							return 1; // L: 3999
						} else if (var0 == 4122) { // L: 4001
							var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 4002
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 4003
							return 1; // L: 4004
						} else if (var0 == 4123) { // L: 4006
							class127.Interpreter_stringStackSize -= 3; // L: 4007
							var3 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize]; // L: 4008
							var4 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1]; // L: 4009
							String var5 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 2]; // L: 4010
							if (class229.localPlayer.appearance == null) { // L: 4011
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5; // L: 4012
								return 1; // L: 4013
							} else {
								switch(class229.localPlayer.appearance.field3598) { // L: 4015
								case 0:
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3; // L: 4017
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4; // L: 4024
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5; // L: 4021
								}

								return 1; // L: 4027
							}
						} else {
							return 2; // L: 4029
						}
					}
				} else {
					class127.Interpreter_stringStackSize -= 2; // L: 3880
					var3 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize]; // L: 3881
					var4 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1]; // L: 3882
					if (class229.localPlayer.appearance != null && class229.localPlayer.appearance.field3600 != 0) { // L: 3883
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4; // L: 3887
					} else {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3; // L: 3884
					}

					return 1; // L: 3889
				}
			}
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lds;IIIB)V",
		garbageValue = "0"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class229.localPlayer != var0) { // L: 10613
			if (Client.menuOptionsCount < 400) { // L: 10614
				String var4;
				if (var0.skillLevel == 0) { // L: 10616
					var4 = var0.actions[0] + var0.username + var0.actions[1] + KeyHandler.method450(var0.combatLevel, class229.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10617
				}

				int var5;
				if (Client.isItemSelected == 1) { // L: 10618
					WorldMapSectionType.insertMenuItemNoShift("Use", Client.field767 + " " + "->" + " " + class167.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10619
				} else if (Client.isSpellSelected) { // L: 10622
					if ((UrlRequest.field1430 & 8) == 8) { // L: 10623
						WorldMapSectionType.insertMenuItemNoShift(Client.field655, Client.field656 + " " + "->" + " " + class167.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10624
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) { // L: 10629
						if (Client.playerMenuActions[var5] != null) { // L: 10630
							short var6 = 0; // L: 10631
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) { // L: 10632
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10633
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class229.localPlayer.combatLevel) { // L: 10634
									var6 = 2000; // L: 10635
								}

								if (class229.localPlayer.team != 0 && var0.team != 0) { // L: 10637
									if (var0.team == class229.localPlayer.team) { // L: 10638
										var6 = 2000;
									} else {
										var6 = 0; // L: 10639
									}
								} else if (Client.playerAttackOption == AttackOption.field1334 && var0.isClanMember()) { // L: 10641
									var6 = 2000; // L: 10642
								}
							} else if (Client.playerOptionsPriorities[var5]) { // L: 10645
								var6 = 2000;
							}

							boolean var7 = false; // L: 10646
							int var8 = Client.playerMenuOpcodes[var5] + var6; // L: 10647
							WorldMapSectionType.insertMenuItemNoShift(Client.playerMenuActions[var5], class167.colorStartTag(16777215) + var4, var8, var1, var2, var3); // L: 10648
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 10653
					if (Client.menuOpcodes[var5] == 23) { // L: 10654
						Client.menuTargets[var5] = class167.colorStartTag(16777215) + var4; // L: 10655
						break;
					}
				}

			}
		}
	} // L: 10659

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Lnn;",
		garbageValue = "725672133"
	)
	static Widget method6885(Widget var0) {
		Widget var1 = class227.method4434(var0); // L: 12216
		if (var1 == null) {
			var1 = var0.parent; // L: 12217
		}

		return var1; // L: 12218
	}
}
