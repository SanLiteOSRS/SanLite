import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ai")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 706955279943509111L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -323054323
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -885858399
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1506829559
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -955747453
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = -8056893470675873067L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1239059943
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1657999347
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1895436129
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 826495123
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1870863145
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1293703447
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 1966416586161698317L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1652979825
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 5633659
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 280210219
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -6822610554360794767L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "2128058823"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = ClientPacket.currentTimeMillis();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILla;Ljf;I)V",
		garbageValue = "1715760839"
	)
	static void method727(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3557 == 0) {
				class305.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				class305.ArchiveDiskActionHandler_thread.setDaemon(true);
				class305.ArchiveDiskActionHandler_thread.start();
				class305.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3557 = 600;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)V",
		garbageValue = "-1319930513"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class69.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1544814105"
	)
	static int method718(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			ChatChannel.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = WorldMapData_1.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						UserComparator5.scriptDotWidget = var12;
					} else {
						Nameable.scriptActiveWidget = var12;
					}

					Script.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
				Widget var10 = WorldMapData_1.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				Script.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
				var3.children = null;
				Script.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				ChatChannel.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--ChatChannel.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							UserComparator5.scriptDotWidget = var3;
						} else {
							Nameable.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				ChatChannel.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Widget var5 = class17.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						UserComparator5.scriptDotWidget = var5;
					} else {
						Nameable.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Leq;",
		garbageValue = "47395397"
	)
	static HorizontalAlignment[] method726() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1632, HorizontalAlignment.field1630, HorizontalAlignment.HorizontalAlignment_centered};
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1550544078"
	)
	static void method750(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "292035251"
	)
	static int method747(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var5 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var5 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
			if (var5.itemId != -1) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1980065411"
	)
	static void method741() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class160.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-205223779"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class17.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				WorldMapSection1.runScriptEvent(var6);
			}

			boolean var8 = true;
			if (var5.contentType > 0) {
				var8 = class343.method6080(var5);
			}

			if (var8) {
				if (class136.method2696(class22.getWidgetFlags(var5), var0 - 1)) {
					PacketBufferNode var7;
					if (var0 == 1) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2658, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 2) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2631, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 3) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2630, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 4) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2659, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 5) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2588, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 6) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2579, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 7) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2660, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 8) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2633, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 9) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2598, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 10) {
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2592, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

				}
			}
		}
	}
}
