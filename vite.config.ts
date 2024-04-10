import { defineConfig } from "vite";
import path, { resolve } from "path";

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [],
  resolve: {
    alias: {
      "@": path.join(__dirname, "src"),
    },
  },
  build: {
    lib: {
      entry: resolve(__dirname, "src/index.ts"),
      name: "dahongpao-core",
      fileName: "dahongpao-core",
    },
    rollupOptions: {
      external: ["react"],
      output: {
        globals: {
          react: "React",
        },
        sourcemap: true,
      },
    },
    cssCodeSplit: true,
  },
});
