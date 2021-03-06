import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("ae")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 309353729
	)
	@Export("element")
	final int element;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Laa;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1945919631
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1219873699
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhd;Lhd;ILaa;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = InvDefinition.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "7",
		signature = "(B)I"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "31041",
		signature = "(S)Laa;"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-413607837",
		signature = "(I)I"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-1875187157",
		signature = "(I)I"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-344987914",
		signature = "(I)I"
	)
	static int method286() {
		return 12;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "18479210",
		signature = "(Lhz;II)V"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2668 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field2660 == null) {
				var0.field2660 = new int[var0.field2668.length];
			}

			var0.field2660[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		garbageValue = "1727285517",
		signature = "(ILcl;ZI)I"
	)
	static int method285(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
