import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fr")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lkl;Lkl;I)I",
		garbageValue = "-1246089706"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Liw;II)Lhk;",
		garbageValue = "1936937358"
	)
	static MusicPatch method3497(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Liw;Liw;I)Z",
		garbageValue = "-301606279"
	)
	public static boolean method3504(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			NPC.WorldMapElement_count = var0.getGroupFileCount(35);
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[NPC.WorldMapElement_count];

			for (int var2 = 0; var2 < NPC.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
					WorldMapElement.WorldMapElement_cached[var2].method4518();
				}
			}

			return true;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)Lht;",
		garbageValue = "-45"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = ScriptFrame.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-1942076594"
	)
	static int method3506(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else {
			return 2;
		}
	}
}
