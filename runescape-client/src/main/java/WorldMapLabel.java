import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fl")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("h")
	@Export("text")
	String text;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1379711685
	)
	@Export("width")
	int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 972901429
	)
	@Export("height")
	int height;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILfi;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "260939477"
	)
	public static int method3582(int var0) {
		return class230.field2816[var0];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "20"
	)
	static int method3583(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-727518714"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1211 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = class17.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					class5.scene.drawEntity(ParamComposition.Client_plane, var2.x, var2.y, SceneTilePaint.getTileHeight(var2.field1211 * 64 - 64 + var2.x, var2.field1211 * 64 - 64 + var2.y, ParamComposition.Client_plane), var2.field1211 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
