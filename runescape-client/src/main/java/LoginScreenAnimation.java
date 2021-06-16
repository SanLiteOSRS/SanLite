import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ck")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("m")
	int[] field1300;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1518059987
	)
	int field1304;
	@ObfuscatedName("h")
	int[] field1294;
	@ObfuscatedName("d")
	int[] field1295;
	@ObfuscatedName("z")
	int[] field1296;
	@ObfuscatedName("b")
	int[] field1297;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1626037151
	)
	int field1298;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -970523767
	)
	int field1299;
	@ObfuscatedName("g")
	int[] field1305;
	@ObfuscatedName("t")
	int[] field1301;
	@ObfuscatedName("x")
	int[] field1302;
	@ObfuscatedName("u")
	int[] field1303;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1812898479
	)
	int field1290;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1843664252
	)
	int field1309;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1310128613
	)
	int field1306;

	@ObfuscatedSignature(
		descriptor = "([Lof;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1300 = new int[256];
		this.field1304 = 0;
		this.field1298 = 0;
		this.field1299 = 0;
		this.field1290 = 0;
		this.field1309 = 0;
		this.field1306 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("initColors")
	void initColors() {
		this.field1295 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1295[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1295[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1295[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1295[var1 + 192] = 16777215;
		}

		this.field1296 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1296[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1296[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1296[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1296[var1 + 192] = 16777215;
		}

		this.field1297 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1297[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1297[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1297[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1297[var1 + 192] = 16777215;
		}

		this.field1294 = new int[256];
		this.field1290 = 0;
		this.field1302 = new int[32768];
		this.field1303 = new int[32768];
		this.method2294((IndexedSprite)null);
		this.field1305 = new int[32768];
		this.field1301 = new int[32768];
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1890255909"
	)
	void method2296() {
		this.field1295 = null;
		this.field1296 = null;
		this.field1297 = null;
		this.field1294 = null;
		this.field1302 = null;
		this.field1303 = null;
		this.field1305 = null;
		this.field1301 = null;
		this.field1290 = 0;
		this.field1309 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "657526565"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1305 == null) {
			this.initColors();
		}

		if (this.field1306 == 0) {
			this.field1306 = var2;
		}

		int var3 = var2 - this.field1306;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1306 = var2;
		if (var3 > 0) {
			this.method2293(var3);
		}

		this.method2290(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-960429455"
	)
	final void method2293(int var1) {
		this.field1290 += var1 * 128;
		int var2;
		if (this.field1290 > this.field1302.length) {
			this.field1290 -= this.field1302.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2294(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1305[var2 + var3] - this.field1302[var2 + this.field1290 & this.field1302.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1305[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1305[var9 + var8] = 255;
				} else {
					this.field1305[var8 + var9] = 0;
				}
			}
		}

		if (this.field1298 * 16 > 0) {
			this.field1298 = this.field1298 * 16 - var1 * 4;
		}

		if (this.field1299 * 16 > 0) {
			this.field1299 = this.field1299 * 16 - var1 * 4;
		}

		if (this.field1298 * 16 == 0 && this.field1299 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1298 = 1024;
			}

			if (var7 == 1) {
				this.field1299 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1300[var7] = this.field1300[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1300[var7] = (int)(Math.sin((double)this.field1304 / 14.0D) * 16.0D + Math.sin((double)this.field1304 / 15.0D) * 14.0D + Math.sin((double)this.field1304 / 16.0D) * 12.0D);
			++this.field1304;
		}

		this.field1309 = this.field1309 * 10000 + var1 * 100;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1309 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1305[var12 + (var13 << 7)] = 192;
			}

			this.field1309 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1305[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1305[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1301[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1301[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1301[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1305[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1318648994"
	)
	final int method2297(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-739412709"
	)
	final void method2290(int var1) {
		int var2 = this.field1294.length;
		if (this.field1298 * 16 > 0) {
			this.method2291(this.field1298 * 16, this.field1296);
		} else if (this.field1299 * 16 > 0) {
			this.method2291(this.field1299 * 16, this.field1297);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1294[var3] = this.field1295[var3];
			}
		}

		this.method2292(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1814814478"
	)
	final void method2291(int var1, int[] var2) {
		int var3 = this.field1294.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1294[var4] = this.method2297(this.field1295[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1294[var4] = var2[var4];
			} else {
				this.field1294[var4] = this.method2297(var2[var4], this.field1295[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	final void method2292(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1300[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= AbstractWorldMapData.rasterProvider.width) {
				var7 = AbstractWorldMapData.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * AbstractWorldMapData.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1305[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1294[var10];
					int var14 = AbstractWorldMapData.rasterProvider.pixels[var8];
					AbstractWorldMapData.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)V",
		garbageValue = "-36"
	)
	final void method2294(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1302.length; ++var2) {
			this.field1302[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1302[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1303[var5] = (this.field1302[var5 + 1] + this.field1302[var5 + 128] + this.field1302[var5 - 128] + this.field1302[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1302;
			this.field1302 = this.field1303;
			this.field1303 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1302[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljp;B)V",
		garbageValue = "4"
	)
	public static void method2312(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		HitSplatDefinition.field1741 = var1;
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1215148892"
	)
	static int method2314(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (DevicePcmPlayerProvider.friendSystem.field928 == 0) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -2;
			} else if (DevicePcmPlayerProvider.friendSystem.field928 == 1) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				if (DevicePcmPlayerProvider.friendSystem.method1804() && var3 >= 0 && var3 < DevicePcmPlayerProvider.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)DevicePcmPlayerProvider.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				if (DevicePcmPlayerProvider.friendSystem.method1804() && var3 >= 0 && var3 < DevicePcmPlayerProvider.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				if (DevicePcmPlayerProvider.friendSystem.method1804() && var3 >= 0 && var3 < DevicePcmPlayerProvider.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					class14.method229(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					DevicePcmPlayerProvider.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					DevicePcmPlayerProvider.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					DevicePcmPlayerProvider.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					DevicePcmPlayerProvider.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					var5 = ScriptFrame.method1232(var5);
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendSystem.isFriended(new Username(var5, loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class289.friendsChatManager != null) {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class289.friendsChatManager.name;
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class289.friendsChatManager != null) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class289.friendsChatManager.getSize();
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					if (class289.friendsChatManager != null && var3 < class289.friendsChatManager.getSize()) {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class289.friendsChatManager.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					if (class289.friendsChatManager != null && var3 < class289.friendsChatManager.getSize()) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((Buddy)class289.friendsChatManager.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					if (class289.friendsChatManager != null && var3 < class289.friendsChatManager.getSize()) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((Buddy)class289.friendsChatManager.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class289.friendsChatManager != null ? class289.friendsChatManager.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					class1.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class289.friendsChatManager != null ? class289.friendsChatManager.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					Coord.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapIcon_0.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!DevicePcmPlayerProvider.friendSystem.method1804()) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.friendSystem.method1804() && var3 >= 0 && var3 < DevicePcmPlayerProvider.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)DevicePcmPlayerProvider.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					var5 = ScriptFrame.method1232(var5);
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var5, loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					if (class289.friendsChatManager != null && var3 < class289.friendsChatManager.getSize() && class289.friendsChatManager.get(var3).getUsername().equals(class262.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class289.friendsChatManager != null && class289.friendsChatManager.owner != null) {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class289.friendsChatManager.owner;
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					if (class289.friendsChatManager != null && var3 < class289.friendsChatManager.getSize() && ((FriendsChatMember)class289.friendsChatManager.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						DevicePcmPlayerProvider.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							DevicePcmPlayerProvider.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							DevicePcmPlayerProvider.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							DevicePcmPlayerProvider.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (class289.friendsChatManager != null) {
								class289.friendsChatManager.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					if (class289.friendsChatManager != null && var3 < class289.friendsChatManager.getSize() && ((FriendsChatMember)class289.friendsChatManager.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1312324085"
	)
	static int method2285(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			ChatChannel.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
