import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("t")
class class13 extends DefaultTlsClient {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lk;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1;
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (var1 == null) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;Lnf;I)Lnf;",
		garbageValue = "261617264"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			int var4 = var2 - 1;
			var4 |= var4 >>> 1;
			var4 |= var4 >>> 2;
			var4 |= var4 >>> 4;
			var4 |= var4 >>> 8;
			var4 |= var4 >>> 16;
			var3 = var4 + 1;
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var7 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var7) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "719840218"
	)
	static int method173(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SecureRandomCallable.Widget_unpackTargetMask(PendingSpawn.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIIIII)V",
		garbageValue = "909796147"
	)
	static final void method177(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field465) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field465 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class184.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class184.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class184.invalidateWidget(var0);
				Client.field465 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class184.invalidateWidget(var0);
			}
		}

	}
}
