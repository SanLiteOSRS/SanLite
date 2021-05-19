import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cf")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -605907223
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -235619829
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -898110991
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 853925999
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -665305113
	)
	@Export("x")
	int x;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1158524887
	)
	@Export("y")
	int y;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -782720615
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 6537399
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLge;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = Player.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field1900 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject)var9;
				if (var10.sequenceDefinition == this.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			label54: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
							break label54;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.sequenceDefinition = null;
			}

			this.cycleStart = Client.cycle - var1;
		}

		ObjectComposition var12 = AttackOption.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-7"
	)
	public static byte[] method2030() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1496767083"
	)
	static int method2027(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
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
			var3.field3004 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var8;
		} else if (var0 == 1428) {
			var3.field3076 = var8;
		} else {
			if (var0 != 1429) {
				return 2;
			}

			var3.field2974 = var8;
		}

		var3.hasListener = true;
		return 1;
	}
}
