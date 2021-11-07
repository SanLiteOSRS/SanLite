import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iy")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -797794259
	)
	int field2973;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Laz;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("s")
	short[] field2972;
	@ObfuscatedName("a")
	byte[] field2974;
	@ObfuscatedName("o")
	byte[] field2971;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lif;"
	)
	MusicPatchNode2[] field2976;
	@ObfuscatedName("e")
	byte[] field2977;
	@ObfuscatedName("p")
	int[] field2975;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128];
		this.field2972 = new short[128];
		this.field2974 = new byte[128];
		this.field2971 = new byte[128];
		this.field2976 = new MusicPatchNode2[128];
		this.field2977 = new byte[128];
		this.field2975 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		++var2.offset;
		++var9;
		byte[] var38 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var38[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var43 = var2.readUnsignedByte();
				if (var43 == 0) {
					var13 = var12++;
				} else {
					if (var43 <= var13) {
						--var43;
					}

					var13 = var43;
				}

				var38[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		MusicPatchNode2[] var39 = new MusicPatchNode2[var12];

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var39.length; ++var14) {
			var15 = var39[var14] = new MusicPatchNode2();
			int var42 = var2.readUnsignedByte();
			if (var42 > 0) {
				var15.field2916 = new byte[var42 * 2];
			}

			var42 = var2.readUnsignedByte();
			if (var42 > 0) {
				var15.field2914 = new byte[var42 * 2 + 2];
				var15.field2914[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var44 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		++var2.offset;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field2972[var20] = (short)var19;
		}

		var19 = 0;

		short[] var50;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var50 = this.field2972;
			var50[var20] = (short)(var50[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.readVarInt();
			}

			var50 = this.field2972;
			var50[var23] = (short)(var50[var23] + ((var22 - 1 & 2) << 14));
			this.field2975[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field2975[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field2977[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field2975[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field2971[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var40 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field2975[var26] != 0) {
				if (var20 == 0) {
					var40 = var39[var38[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field2976[var26] = var40;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field2975[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field2974[var27] = (byte)var26;
			--var20;
		}

		this.field2973 = var2.readUnsignedByte() + 1;

		int var29;
		MusicPatchNode2 var41;
		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field2916 != null) {
				for (var29 = 1; var29 < var41.field2916.length; var29 += 2) {
					var41.field2916[var29] = var2.readByte();
				}
			}

			if (var41.field2914 != null) {
				for (var29 = 3; var29 < var41.field2914.length - 2; var29 += 2) {
					var41.field2914[var29] = var2.readByte();
				}
			}
		}

		if (var44 != null) {
			for (var27 = 1; var27 < var44.length; var27 += 2) {
				var44[var27] = var2.readByte();
			}
		}

		if (var16 != null) {
			for (var27 = 1; var27 < var16.length; var27 += 2) {
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field2914 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var41.field2914.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var41.field2914[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field2916 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var41.field2916.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var41.field2916[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		int var47;
		byte var49;
		if (var44 != null) {
			var19 = var2.readUnsignedByte();
			var44[0] = (byte)var19;

			for (var27 = 2; var27 < var44.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var44[var27] = (byte)var19;
			}

			var49 = var44[0];
			byte var28 = var44[1];

			for (var29 = 0; var29 < var49; ++var29) {
				this.field2974[var29] = (byte)(var28 * this.field2974[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var44.length; var29 += 2) {
				var30 = var44[var29];
				byte var31 = var44[var29 + 1];
				var32 = var28 * (var30 - var49) + (var30 - var49) / 2;

				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var32 + var36) / var35 - var36;
					this.field2974[var33] = (byte)(var34 * this.field2974[var33] + 32 >> 6);
					var32 += var31 - var28;
				}

				var49 = var30;
				var28 = var31;
			}

			for (var47 = var49; var47 < 128; ++var47) {
				this.field2974[var47] = (byte)(var28 * this.field2974[var47] + 32 >> 6);
			}

			var15 = null;
		}

		if (var16 != null) {
			var19 = var2.readUnsignedByte();
			var16[0] = (byte)var19;

			for (var27 = 2; var27 < var16.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var16[var27] = (byte)var19;
			}

			var49 = var16[0];
			int var46 = var16[1] << 1;

			for (var29 = 0; var29 < var49; ++var29) {
				var47 = var46 + (this.field2971[var29] & 255);
				if (var47 < 0) {
					var47 = 0;
				}

				if (var47 > 128) {
					var47 = 128;
				}

				this.field2971[var29] = (byte)var47;
			}

			int var48;
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				var30 = var16[var29];
				var48 = var16[var29 + 1] << 1;
				var32 = var46 * (var30 - var49) + (var30 - var49) / 2;

				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var36 + var32) / var35 - var36;
					int var37 = var34 + (this.field2971[var33] & 255);
					if (var37 < 0) {
						var37 = 0;
					}

					if (var37 > 128) {
						var37 = 128;
					}

					this.field2971[var33] = (byte)var37;
					var32 += var48 - var46;
				}

				var49 = var30;
				var46 = var48;
			}

			for (var47 = var49; var47 < 128; ++var47) {
				var48 = var46 + (this.field2971[var47] & 255);
				if (var48 < 0) {
					var48 = 0;
				}

				if (var48 > 128) {
					var48 = 128;
				}

				this.field2971[var47] = (byte)var48;
			}

			Object var45 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field2913 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field2916 != null) {
				var41.field2918 = var2.readUnsignedByte();
			}

			if (var41.field2914 != null) {
				var41.field2915 = var2.readUnsignedByte();
			}

			if (var41.field2913 > 0) {
				var41.field2912 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field2911 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field2911 > 0) {
				var41.field2917 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field2917 > 0) {
				var41.field2919 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lad;[B[II)Z",
		garbageValue = "-1514106503"
	)
	boolean method4945(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true;
		int var5 = 0;
		RawSound var6 = null;

		for (int var7 = 0; var7 < 128; ++var7) {
			if (var2 == null || var2[var7] != 0) {
				int var8 = this.field2975[var7];
				if (var8 != 0) {
					if (var5 != var8) {
						var5 = var8--;
						if ((var8 & 1) == 0) {
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3);
						}

						if (var6 == null) {
							var4 = false;
						}
					}

					if (var6 != null) {
						this.rawSounds[var7] = var6;
						this.field2975[var7] = 0;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1852268477"
	)
	@Export("clear")
	void clear() {
		this.field2975 = null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "302724189"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class21.World_request == null) {
				class21.World_request = class320.urlRequester.request(new URL(BoundaryObject.field2618));
			} else if (class21.World_request.isDone()) {
				byte[] var0 = class21.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				WorldMapEvent.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = WorldMapEvent.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				ObjectSound.sortWorlds(WorldMapEvent.World_worlds, 0, WorldMapEvent.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class21.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class21.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "38"
	)
	public static int method4949(int var0, int var1, int var2) {
		int var3 = class123.method2619(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "-51"
	)
	static int method4950(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field3172 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3056 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3166 = var8;
		} else if (var0 == 1430) {
			var3.field3161 = var8;
		} else {
			if (var0 != 1431) {
				return 2;
			}

			var3.field3162 = var8;
		}

		var3.hasListener = true;
		return 1;
	}
}
