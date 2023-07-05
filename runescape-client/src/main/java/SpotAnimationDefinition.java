import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ho")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("jc")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -353303845
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 901346361
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -92560425
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("ak")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ae")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("af")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ao")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -33661509
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -973947101
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 261658215
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1109298941
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -818946995
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-1476524281"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 49
			if (var2 == 0) {
				return; // L: 53
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-2099355738"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 57
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 61
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3]; // L: 65
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte(); // L: 73
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 77
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ljd;",
		garbageValue = "72733370"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3764();
		Model var3;
		if (this.sequence != -1 && var1 != -1) {
			var3 = WorldMapLabelSize.SequenceDefinition_get(this.sequence).method4050(var2, var1);
		} else {
			var3 = var2.method4777(true);
		}

		if (this.widthScale != 128 || this.heightScale != 128) {
			var3.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) { // L: 90
			if (this.orientation == 90) {
				var3.rotateY90Ccw();
			}

			if (this.orientation == 180) {
				var3.rotateY90Ccw();
				var3.rotateY90Ccw(); // L: 94
			}

			if (this.orientation == 270) {
				var3.rotateY90Ccw();
				var3.rotateY90Ccw(); // L: 98
				var3.rotateY90Ccw(); // L: 99
			}
		}

		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljd;",
		garbageValue = "117"
	)
	public final Model method3764() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 106
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var2 == null) { // L: 109
				return null;
			}

			int var3;
			if (this.recolorFrom != null) { // L: 110
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) { // L: 115
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
		}

		return var1; // L: 123
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Loj;IB)Llm;",
		garbageValue = "-50"
	)
	public static PacketBufferNode method3778(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher); // L: 23
		var4.packetBuffer.writeByte(0); // L: 24
		int var5 = var4.packetBuffer.offset; // L: 25
		var4.packetBuffer.writeByte(var0); // L: 26
		String var6 = var1.toLowerCase(); // L: 27
		int var7 = 0; // L: 28
		byte[] var8 = null; // L: 29
		if (var6.startsWith("yellow:")) { // L: 30
			var7 = 0; // L: 31
			var1 = var1.substring("yellow:".length()); // L: 32
		} else if (var6.startsWith("red:")) { // L: 34
			var7 = 1; // L: 35
			var1 = var1.substring("red:".length()); // L: 36
		} else if (var6.startsWith("green:")) { // L: 38
			var7 = 2; // L: 39
			var1 = var1.substring("green:".length()); // L: 40
		} else if (var6.startsWith("cyan:")) { // L: 42
			var7 = 3; // L: 43
			var1 = var1.substring("cyan:".length()); // L: 44
		} else if (var6.startsWith("purple:")) { // L: 46
			var7 = 4; // L: 47
			var1 = var1.substring("purple:".length()); // L: 48
		} else if (var6.startsWith("white:")) { // L: 50
			var7 = 5; // L: 51
			var1 = var1.substring("white:".length()); // L: 52
		} else if (var6.startsWith("flash1:")) { // L: 54
			var7 = 6; // L: 55
			var1 = var1.substring("flash1:".length()); // L: 56
		} else if (var6.startsWith("flash2:")) { // L: 58
			var7 = 7; // L: 59
			var1 = var1.substring("flash2:".length()); // L: 60
		} else if (var6.startsWith("flash3:")) { // L: 62
			var7 = 8; // L: 63
			var1 = var1.substring("flash3:".length()); // L: 64
		} else if (var6.startsWith("glow1:")) { // L: 66
			var7 = 9; // L: 67
			var1 = var1.substring("glow1:".length()); // L: 68
		} else if (var6.startsWith("glow2:")) { // L: 70
			var7 = 10; // L: 71
			var1 = var1.substring("glow2:".length()); // L: 72
		} else if (var6.startsWith("glow3:")) { // L: 74
			var7 = 11; // L: 75
			var1 = var1.substring("glow3:".length()); // L: 76
		} else if (var6.startsWith("rainbow:")) { // L: 78
			var7 = 12; // L: 79
			var1 = var1.substring("rainbow:".length()); // L: 80
		} else if (var6.startsWith("pattern")) { // L: 82
			boolean var10 = true; // L: 85
			boolean var11 = true; // L: 86
			int var12 = "pattern".length(); // L: 87
			int var13 = 0; // L: 88
			byte[] var14 = new byte[8]; // L: 89

			byte[] var9;
			while (true) {
				int var15 = var13 + var12; // L: 91
				if (var15 >= var6.length()) { // L: 92
					var9 = null; // L: 93
					break;
				}

				char var16 = var6.charAt(var15); // L: 96
				if (var16 == ':') { // L: 97
					if (var13 == 0) { // L: 116
						var9 = null; // L: 117
					} else {
						byte[] var17 = new byte[var13]; // L: 120
						System.arraycopy(var14, 0, var17, 0, var13); // L: 121
						var9 = var17; // L: 122
					}
					break;
				}

				if (var14.length == var13) { // L: 100
					var9 = null; // L: 101
					break; // L: 102
				}

				if (var16 >= '0' && var16 <= '9') { // L: 104
					var16 = (char)(var16 - '0'); // L: 105
				} else {
					if (var16 < 'a' || var16 > 'z') { // L: 107
						var9 = null; // L: 111
						break; // L: 112
					}

					var16 = (char)(var16 - 'W'); // L: 108
				}

				var14[var13++] = (byte)var16; // L: 114
			}

			var8 = var9; // L: 124
			if (var9 != null) { // L: 125
				var7 = var9.length + 12; // L: 126
				var1 = var1.substring("pattern".length() + var9.length + 1); // L: 127
			}
		}

		var6 = var1.toLowerCase(); // L: 130
		byte var18 = 0; // L: 131
		if (var6.startsWith("wave:")) { // L: 132
			var18 = 1; // L: 133
			var1 = var1.substring("wave:".length()); // L: 134
		} else if (var6.startsWith("wave2:")) { // L: 136
			var18 = 2; // L: 137
			var1 = var1.substring("wave2:".length()); // L: 138
		} else if (var6.startsWith("shake:")) { // L: 140
			var18 = 3; // L: 141
			var1 = var1.substring("shake:".length()); // L: 142
		} else if (var6.startsWith("scroll:")) { // L: 144
			var18 = 4; // L: 145
			var1 = var1.substring("scroll:".length()); // L: 146
		} else if (var6.startsWith("slide:")) { // L: 148
			var18 = 5; // L: 149
			var1 = var1.substring("slide:".length()); // L: 150
		}

		var4.packetBuffer.writeByte(var7); // L: 152
		var4.packetBuffer.writeByte(var18); // L: 153
		if (var8 != null && Client.field512 >= 214) { // L: 154
			for (int var19 = 0; var19 < var8.length; ++var19) { // L: 155
				var4.packetBuffer.writeByte(var8[var19]); // L: 156
			}
		}

		class324.method6006(var4.packetBuffer, var1); // L: 159
		if (var0 == class337.field3778.rsOrdinal()) { // L: 160
			var4.packetBuffer.writeByte(var3); // L: 161
		}

		var4.packetBuffer.method9017(var4.packetBuffer.offset - var5); // L: 163
		return var4; // L: 164
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1461228191"
	)
	static int method3777(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2842
			if (ApproximateRouteStrategy.friendSystem.field835 == 0) { // L: 2843
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (ApproximateRouteStrategy.friendSystem.field835 == 1) { // L: 2844
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.friendsList.getSize(); // L: 2845
			}

			return 1; // L: 2846
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2849
				if (ApproximateRouteStrategy.friendSystem.method1803() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.friendsList.getSize()) { // L: 2850
					Friend var8 = (Friend)ApproximateRouteStrategy.friendSystem.friendsList.get(var3); // L: 2851
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2852
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2853
				} else {
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2856
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2857
				}

				return 1; // L: 2859
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2862
				if (ApproximateRouteStrategy.friendSystem.method1803() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.friendsList.getSize()) { // L: 2863
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ApproximateRouteStrategy.friendSystem.friendsList.get(var3)).world; // L: 2864
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2866
				}

				return 1; // L: 2867
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2870
				if (ApproximateRouteStrategy.friendSystem.method1803() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.friendsList.getSize()) { // L: 2871
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ApproximateRouteStrategy.friendSystem.friendsList.get(var3)).rank; // L: 2872
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2874
				}

				return 1; // L: 2875
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 2878
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2879
					class10.method102(var5, var9); // L: 2880
					return 1; // L: 2881
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 2884
					ApproximateRouteStrategy.friendSystem.addFriend(var5); // L: 2885
					return 1; // L: 2886
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 2889
					ApproximateRouteStrategy.friendSystem.removeFriend(var5); // L: 2890
					return 1; // L: 2891
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 2894
					ApproximateRouteStrategy.friendSystem.addIgnore(var5); // L: 2895
					return 1; // L: 2896
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 2899
					boolean var6 = true; // L: 2900
					ApproximateRouteStrategy.friendSystem.method1815(var5, var6); // L: 2901
					return 1; // L: 2902
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 2905
					var5 = Canvas.method326(var5); // L: 2906
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.isFriended(new Username(var5, WorldMapScaleHandler.loginType), false) ? 1 : 0; // L: 2907
					return 1; // L: 2908
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class406.friendsChatManager != null) { // L: 2911
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class406.friendsChatManager.name; // L: 2912
					} else {
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2914
					}

					return 1; // L: 2915
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class406.friendsChatManager != null) { // L: 2918
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class406.friendsChatManager.getSize(); // L: 2919
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2921
					}

					return 1; // L: 2922
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2925
					if (class406.friendsChatManager != null && var3 < class406.friendsChatManager.getSize()) { // L: 2926
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class406.friendsChatManager.get(var3).getUsername().getName(); // L: 2927
					} else {
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2929
					}

					return 1; // L: 2930
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2933
					if (class406.friendsChatManager != null && var3 < class406.friendsChatManager.getSize()) { // L: 2934
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class406.friendsChatManager.get(var3)).getWorld(); // L: 2935
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2937
					}

					return 1; // L: 2938
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2941
					if (class406.friendsChatManager != null && var3 < class406.friendsChatManager.getSize()) { // L: 2942
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class406.friendsChatManager.get(var3)).rank; // L: 2943
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2945
					}

					return 1; // L: 2946
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class406.friendsChatManager != null ? class406.friendsChatManager.minKick : 0; // L: 2949
					return 1; // L: 2950
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 2953
					NPC.clanKickUser(var5); // L: 2954
					return 1; // L: 2955
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class406.friendsChatManager != null ? class406.friendsChatManager.rank : 0; // L: 2958
					return 1; // L: 2959
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 2962
					class7.Clan_joinChat(var5); // L: 2963
					return 1; // L: 2964
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class441.Clan_leaveChat(); // L: 2967
					return 1; // L: 2968
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!ApproximateRouteStrategy.friendSystem.method1803()) { // L: 2971
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.ignoreList.getSize(); // L: 2972
					}

					return 1; // L: 2973
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2976
					if (ApproximateRouteStrategy.friendSystem.method1803() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.ignoreList.getSize()) { // L: 2977
						Ignored var4 = (Ignored)ApproximateRouteStrategy.friendSystem.ignoreList.get(var3); // L: 2978
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2979
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2980
					} else {
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2983
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2984
					}

					return 1; // L: 2986
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 2989
					var5 = Canvas.method326(var5); // L: 2990
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var5, WorldMapScaleHandler.loginType)) ? 1 : 0; // L: 2991
					return 1; // L: 2992
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2995
					if (class406.friendsChatManager != null && var3 < class406.friendsChatManager.getSize() && class406.friendsChatManager.get(var3).getUsername().equals(Projectile.localPlayer.username)) { // L: 2996
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2997
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2999
					}

					return 1; // L: 3000
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class406.friendsChatManager != null && class406.friendsChatManager.owner != null) { // L: 3003
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class406.friendsChatManager.owner; // L: 3004
					} else {
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 3006
					}

					return 1; // L: 3007
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3010
					if (class406.friendsChatManager != null && var3 < class406.friendsChatManager.getSize() && ((FriendsChatMember)class406.friendsChatManager.get(var3)).isFriend()) { // L: 3011
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3012
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3014
					}

					return 1; // L: 3015
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						ApproximateRouteStrategy.friendSystem.friendsList.removeComparator(); // L: 3026
						return 1; // L: 3027
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3030
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3031
							return 1; // L: 3032
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3035
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3036
							return 1; // L: 3037
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3040
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3041
							return 1; // L: 3042
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3045
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3046
							return 1; // L: 3047
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3050
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3051
							return 1; // L: 3052
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3055
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3056
							return 1; // L: 3057
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3060
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3061
							return 1; // L: 3062
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3065
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3066
							return 1; // L: 3067
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3070
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3071
							return 1; // L: 3072
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3075
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3076
							return 1; // L: 3077
						} else if (var0 == 3639) {
							ApproximateRouteStrategy.friendSystem.friendsList.sort(); // L: 3080
							return 1; // L: 3081
						} else if (var0 == 3640) {
							ApproximateRouteStrategy.friendSystem.ignoreList.removeComparator(); // L: 3084
							return 1; // L: 3085
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3088
							ApproximateRouteStrategy.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3089
							return 1; // L: 3090
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3093
							ApproximateRouteStrategy.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3094
							return 1; // L: 3095
						} else if (var0 == 3643) {
							ApproximateRouteStrategy.friendSystem.ignoreList.sort(); // L: 3098
							return 1; // L: 3099
						} else if (var0 == 3644) {
							if (class406.friendsChatManager != null) { // L: 3102
								class406.friendsChatManager.removeComparator(); // L: 3103
							}

							return 1; // L: 3105
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3108
							if (class406.friendsChatManager != null) { // L: 3109
								class406.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3110
							}

							return 1; // L: 3112
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3115
							if (class406.friendsChatManager != null) { // L: 3116
								class406.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3117
							}

							return 1; // L: 3119
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3122
							if (class406.friendsChatManager != null) { // L: 3123
								class406.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3124
							}

							return 1; // L: 3126
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3129
							if (class406.friendsChatManager != null) { // L: 3130
								class406.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3131
							}

							return 1; // L: 3133
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3136
							if (class406.friendsChatManager != null) { // L: 3137
								class406.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3138
							}

							return 1; // L: 3140
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3143
							if (class406.friendsChatManager != null) { // L: 3144
								class406.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3145
							}

							return 1; // L: 3147
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3150
							if (class406.friendsChatManager != null) { // L: 3151
								class406.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3152
							}

							return 1; // L: 3154
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3157
							if (class406.friendsChatManager != null) { // L: 3158
								class406.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3159
							}

							return 1; // L: 3161
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3164
							if (class406.friendsChatManager != null) { // L: 3165
								class406.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3166
							}

							return 1; // L: 3168
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3171
							if (class406.friendsChatManager != null) { // L: 3172
								class406.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3173
							}

							return 1; // L: 3175
						} else if (var0 == 3655) {
							if (class406.friendsChatManager != null) { // L: 3178
								class406.friendsChatManager.sort(); // L: 3179
							}

							return 1; // L: 3181
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3184
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3185
							return 1; // L: 3186
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3189
							if (class406.friendsChatManager != null) { // L: 3190
								class406.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3191
							}

							return 1; // L: 3193
						} else {
							return 2; // L: 3195
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3018
					if (class406.friendsChatManager != null && var3 < class406.friendsChatManager.getSize() && ((FriendsChatMember)class406.friendsChatManager.get(var3)).isIgnored()) { // L: 3019
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3020
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3022
					}

					return 1; // L: 3023
				}
			}
		}
	}
}
