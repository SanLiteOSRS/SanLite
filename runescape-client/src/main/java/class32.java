import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public final class class32 {
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 450314799
	)
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "121"
	)
	public static boolean method384(int var0) {
		return var0 == WorldMapDecorationType.field3168.id;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-88"
	)
	static int method386(int var0, Script var1, boolean var2) {
		if (var0 == 3800) {
			if (WorldMapManager.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
				DirectByteArrayCopier.field3128 = WorldMapManager.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == 3801) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
					DirectByteArrayCopier.field3128 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = DirectByteArrayCopier.field3128.name;
				return 1;
			} else if (var0 == 3803) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field87;
				return 1;
			} else if (var0 == 3805) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field88;
				return 1;
			} else if (var0 == 3806) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field93;
				return 1;
			} else if (var0 == 3807) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field90;
				return 1;
			} else if (var0 == 3809) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.memberCount;
				return 1;
			} else if (var0 == 3810) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = DirectByteArrayCopier.field3128.memberNames[var3];
				return 1;
			} else if (var0 == 3811) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.memberRanks[var3];
				return 1;
			} else if (var0 == 3812) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.bannedMemberCount;
				return 1;
			} else if (var0 == 3813) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = DirectByteArrayCopier.field3128.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == 3814) {
					ChatChannel.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.method170(var3, var6, var5);
					return 1;
				} else if (var0 == 3815) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.currentOwner;
					return 1;
				} else if (var0 == 3816) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field99;
					return 1;
				} else if (var0 == 3817) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.method196(Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == 3818) {
					Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.getSortedMembers()[Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == 3819) {
					ChatChannel.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
					WorldMapRegion.method3519(var6, var3);
					return 1;
				} else if (var0 == 3820) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field96[var3];
					return 1;
				} else {
					if (var0 == 3821) {
						ChatChannel.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
						GrandExchangeOfferAgeComparator.method5203(var5, var3, var4);
					}

					if (var0 == 3822) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field97[var3] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (AttackOption.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
							WorldMapIcon_0.field2031 = AttackOption.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
							WorldMapIcon_0.field2031 = Client.currentClanChannels[var3];
							class21.field171 = var3;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = WorldMapIcon_0.field2031.name;
						return 1;
					} else if (var0 == 3853) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.field28;
						return 1;
					} else if (var0 == 3854) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.field27;
						return 1;
					} else if (var0 == 3855) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.method49();
						return 1;
					} else if (var0 == 3856) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ((ClanChannelMember)WorldMapIcon_0.field2031.members.get(var3)).name;
						return 1;
					} else if (var0 == 3857) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapIcon_0.field2031.members.get(var3)).rank;
						return 1;
					} else if (var0 == 3858) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapIcon_0.field2031.members.get(var3)).world;
						return 1;
					} else if (var0 == 3859) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						class29.method378(class21.field171, var3);
						return 1;
					} else if (var0 == 3860) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.method38(Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == 3861) {
						Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.getSortedMembers()[Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == 3890) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class10.field74 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-45"
	)
	public static int method387(String var0) {
		return var0.length() + 2;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIIILoa;Liq;B)V",
		garbageValue = "-104"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method7041(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
