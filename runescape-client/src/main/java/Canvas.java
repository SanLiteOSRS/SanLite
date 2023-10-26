import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ac")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1989828526"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class91.World_request == null) { // L: 32
				class91.World_request = AbstractWorldMapIcon.urlRequester.request(new URL(class59.field450));
			} else if (class91.World_request.isDone()) { // L: 34
				byte[] var0 = class91.World_request.getResponse(); // L: 35
				Buffer var1 = new Buffer(var0); // L: 36
				var1.readInt(); // L: 37
				World.World_count = var1.readUnsignedShort(); // L: 38
				UserComparator3.World_worlds = new World[World.World_count]; // L: 39

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 40 48
					var3 = UserComparator3.World_worlds[var2] = new World(); // L: 41
					var3.id = var1.readUnsignedShort(); // L: 42
					var3.properties = var1.readInt(); // L: 43
					var3.host = var1.readStringCp1252NullTerminated(); // L: 44
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 45
					var3.location = var1.readUnsignedByte(); // L: 46
					var3.population = var1.readShort(); // L: 47
				}

				class12.sortWorlds(UserComparator3.World_worlds, 0, UserComparator3.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 50
				class91.World_request = null; // L: 51
				return true; // L: 52
			}
		} catch (Exception var4) { // L: 56
			var4.printStackTrace(); // L: 57
			class91.World_request = null; // L: 58
		}

		return false; // L: 60
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)I",
		garbageValue = "-907105353"
	)
	static int method320(Widget var0) {
		if (var0.type != 11) { // L: 1573
			Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize - 1] = ""; // L: 1574
			return 1; // L: 1575
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1577
			Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var0.method6606(var1); // L: 1578
			return 1; // L: 1579
		}
	}
}
