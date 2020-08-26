import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@ObfuscatedName("ap")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 1433563031
	)
	static int field212;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -18311555
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lal;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2141926567
	)
	@Export("element")
	int element;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Laq;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 578089951
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -258563275
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhg;Lhg;ILal;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1613828162"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)Laq;",
		garbageValue = "499378708"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "182515130"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-2001682063"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1388314285"
	)
	@Export("init")
	void init() {
		this.element = MidiPcmStream.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(WorldMapSection0.WorldMapElement_get(this.element));
		WorldMapElement var1 = WorldMapSection0.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1482054985"
	)
	static void method377() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-40638792"
	)
	public static int method381(int var0) {
		return TileItem.method2209(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "126"
	)
	static boolean method380(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class60.field451.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class56.method899(class60.applet, var2, new Object[]{(new URL(class60.applet.getCodeBase(), var0)).toString()});
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class60.applet;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var9) {
			}

			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "-1976803623"
	)
	static int method378(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Canvas.field438 : class3.field12;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		signature = "(Lbs;I)V",
		garbageValue = "777785142"
	)
	static final void method375(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = ScriptEvent.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = ScriptEvent.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = ScriptEvent.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = ScriptEvent.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = ScriptEvent.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = UserComparator9.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field961 = var4;
		var0.field960 = var5;
	}
}
