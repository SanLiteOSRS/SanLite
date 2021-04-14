import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ll")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("o")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Ljava/util/Comparator;I)V",
		garbageValue = "-1553050282"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Llt;Llt;I)I",
		garbageValue = "833589834"
	)
	@Export("compareUser")
	protected final int compareUser(Nameable var1, Nameable var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("f")
	static double method5714(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1686681071"
	)
	static int method5710(int var0, Script var1, boolean var2) {
		Widget var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class223.method4231(DirectByteArrayCopier.getWidgetClickMask(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
